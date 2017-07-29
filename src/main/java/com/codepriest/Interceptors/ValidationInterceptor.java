package com.codepriest.Interceptors;

import com.codepriest.utilities.ValidateValue;
import com.codepriest.utilities.Validation;
import com.google.gson.Gson;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
                    ValidateValue validateValue = methodParameter.getMethodAnnotation(ValidateValue.class);
                    if (validateValue != null) {

                        switch (validateValue.type()) {
                            case "Email":
                            case "email":
                                String email = request.getParameter(validateValue.type());
                                //validate and add to errors
                                break;


                        }
                    }
                }
            }
            if (errors.isEmpty())
                return true;
            else {
                String error = new Gson().toJson(errors);
                response.setStatus(HttpStatus.OK.value());
                response.getWriter().write(error);
                response.getWriter().flush();
                return false;
            }
        }
        return super.preHandle(request, response, handler);
    }
}
