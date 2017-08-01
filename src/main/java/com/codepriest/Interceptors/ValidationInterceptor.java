package com.codepriest.Interceptors;

import com.codepriest.utilities.*;
import com.google.gson.Gson;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Component
public class ValidationInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Validation validation = handlerMethod.getMethodAnnotation(Validation.class);
            List<String> errors = new ArrayList<>();
            if (validation != null) {
                MethodParameter[] methodParameters = handlerMethod.getMethodParameters();
                for (MethodParameter methodParameter : methodParameters) {
                    ValidationObject validateObject = methodParameter.getMethodAnnotation(ValidationObject.class);
                    if (validateObject != null) {
                        for (Field field : methodParameter.getParameterType().getDeclaredFields()) {
                            ValidateValue[] validateValues = field.getAnnotationsByType(ValidateValue.class);
                            for (ValidateValue validateValue : validateValues) {
                                String value = request.getParameter(field.getName());
                                if (Boolean.valueOf(validateValue.isEmail())) {
                                    if (!EmailValidator.getInstance().isValid(value))
                                        errors.add(field.getName() + " is not a valid email Address");
                                }
                                if (Boolean.valueOf(validateValue.isPhoneNumber())) {
                                    if (!Validator.isPhoneNumber(value))
                                        errors.add(field.getName() + " is not a valid phone number");
                                }


                            }


                        }


                    }
                }
            }
            if (errors.isEmpty())
                return true;
            else {
                String error = new Gson().toJson(errors);
                response.setStatus(CustomHttpStatus.VALIDATION_ERRORS.value());
                response.getWriter().write(error);
                response.getWriter().flush();
                return false;
            }
        }
        return super.preHandle(request, response, handler);
    }
}
