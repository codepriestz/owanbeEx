package com.codepriest.Session;

import com.codepriest.Model.User;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentMap;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Component

public class SessionManager {
    static ConcurrentMap<String, User> manager;

    public static void Add(String key, User u) {
        manager.put(key, u);
    }

    public static void remove(String key) {
        manager.remove(key);
    }

    public static void update(String key, User u) {
        manager.replace(key, u);
    }

    public static User get(String sessionId) {
        return manager.get(sessionId);
    }
}
