package com.codepriest.service;

import com.codepriest.DAO.UserDao;
import com.codepriest.utilities.Awesome;
import com.codepriest.utilities.RequestObj;
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

    public Awesome Login(String email, String password) {
        throw new NotImplementedException();
    }

    public Awesome Register(RequestObj obj) {
        throw new NotImplementedException();
    }
}
