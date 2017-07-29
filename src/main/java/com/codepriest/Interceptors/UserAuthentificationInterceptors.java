package com.codepriest.Interceptors;

import com.codepriest.Model.User;
import com.codepriest.utilities.CustomHttpStatus;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by App Celestine on 7/29/2017.
 */
public class UserAuthentificationInterceptors extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession = request.getSession();

        User user = (User) httpSession.getAttribute("token");
        if (user == null) {
            response.setStatus(CustomHttpStatus.EXPIRED_SESSION.getId(), CustomHttpStatus.EXPIRED_SESSION.getMessage());
            return false;
        }
        request.setAttribute("user", user);
        return super.preHandle(request, response, handler);
    }
}
