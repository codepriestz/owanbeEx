package com.codepriest.Session;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Component

public class SessionManager {
    static ConcurrentMap<Integer, HttpSession> manager;

    static void Add(Integer key, HttpSession session) {
        manager.put(key, session);
    }

    static void remove(Integer key) {
        manager.remove(key);
    }

    static void update(Integer key, HttpSession session) {
        manager.replace(key, session);
    }
}
