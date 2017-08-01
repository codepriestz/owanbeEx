package com.codepriest.Session;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Component
public class SessionListener implements HttpSessionListener {
    HttpSession httpSession;

    public SessionListener() {
        super();
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        return;

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        httpSession = httpSessionEvent.getSession();
        SessionManager.remove(httpSession.getId());

    }
}
