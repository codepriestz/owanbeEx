package com.codepriest.service;

import com.codepriest.DAO.UserDao;
import com.codepriest.Exceptions.AuthentificationException;
import com.codepriest.Model.User;
import com.codepriest.Session.SessionManager;
import com.codepriest.utilities.Awesome;
import com.codepriest.utilities.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by App Celestine on 7/28/2017.
 */
@Service("authentification_service")
public class AuthentificationService {
    @Autowired
    UserDao userDao;

    public Awesome LoginAdmin(String email, String password, Integer type, String sessionId) throws AuthentificationException {
        User user = userDao.findBy(email, password, type);
        if (user == null)
            throw new AuthentificationException();
        SessionManager.Add(sessionId, user);
        return StandardResponse.ok(user);

    }

    public Awesome Register(String email,
                            String address,
                            String phoneNumbers,
                            String state,
                            String city) {
        throw new NotImplementedException();
    }
}
