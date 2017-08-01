package com.codepriest.utilities;

import com.codepriest.Exceptions.AuthentificationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by App Celestine on 8/1/2017.
 */
@ControllerAdvice
class ExceptionHandlers {

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(AuthentificationException.class)
    public Awesome HandleAuthentificationException() {
        return StandardResponse.invalidUserOrPass();
    }
}
