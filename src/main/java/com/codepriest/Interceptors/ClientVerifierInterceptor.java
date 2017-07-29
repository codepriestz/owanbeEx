package com.codepriest.Interceptors;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Component
@ConfigurationProperties(prefix = "client")
public class ClientVerifierInterceptor extends HandlerInterceptorAdapter {
    String clientkey;

    public String getClientkey() {
        return clientkey;
    }

    public void setClientkey(String clientkey) {
        this.clientkey = clientkey;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String key = request.getHeader("clientkey");

        if (key != clientkey) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value(), "Invalid Key");
            return false;
        }
        return super.preHandle(request, response, handler);
    }
}
