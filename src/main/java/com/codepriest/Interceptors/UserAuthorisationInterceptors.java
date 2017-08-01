package com.codepriest.Interceptors;

import com.codepriest.Model.User;
import com.codepriest.Session.SessionManager;
import com.codepriest.utilities.CustomHttpStatus;
import org.ow2.util.base64.Base64;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by App Celestine on 7/29/2017.
 */
public class UserAuthorisationInterceptors extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession = request.getSession();
        String token = request.getHeader("Authorization");
        token = Base64.decode(token.toCharArray()).toString();
        User user = SessionManager.get(httpSession.getId());
        if (user != null) {
            if (user.getToken() != token) {
                response.setStatus(CustomHttpStatus.UNAUTHORIZED.value(), CustomHttpStatus.UNAUTHORIZED.getReasonPhrase());
                return false;
            }

        } else {
            response.setStatus(CustomHttpStatus.EXPIRED_SESSION.value(), CustomHttpStatus.EXPIRED_SESSION.getReasonPhrase());
            return false;
        }
        request.setAttribute("user", user);
        return true;
    }
}
