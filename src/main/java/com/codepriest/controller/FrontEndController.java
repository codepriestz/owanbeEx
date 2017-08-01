package com.codepriest.controller;


import com.codepriest.Exceptions.AuthentificationException;
import com.codepriest.service.AuthentificationService;
import com.codepriest.utilities.Awesome;
import com.codepriest.utilities.RequestObj;
import com.codepriest.utilities.Validation;
import com.codepriest.utilities.ValidationObject;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by App Celestine on 7/28/2017.
 */
@RestController
@RequestMapping(consumes = "application/json", produces = "application/json", value = "/Auth")
public class FrontEndController extends Controller {
    @Autowired
    AuthentificationService authentificationService;


    @RequestMapping(value = "/Login/{type}", method = RequestMethod.POST)
    public Awesome Login(@RequestBody RequestObj requestObj, @PathVariable Integer type, HttpServletRequest request, HttpServletResponse response) throws AuthentificationException {

        Awesome awe = authentificationService.LoginAdmin(requestObj.getEmail(), requestObj.getPassword(), type, request.getSession(true).getId());
        response.setStatus(HttpServletResponse.SC_OK);
        return awe;
    }

    @Validation
    @RequestMapping(value = "/Register/{type}", method = RequestMethod.POST)
    public Awesome Register(@RequestBody @ValidationObject RequestObj requestObj, @PathVariable Integer type, HttpServletRequest request, HttpServletResponse response) {

        Awesome awe = authentificationService.Register(requestObj.getEmail(), requestObj.getAddress(), requestObj.getPhoneNumbers(), requestObj.getState(), requestObj.getCity());
        response.setStatus(HttpServletResponse.SC_OK);
        return awe;
    }
}
