package com.codepriest.Exceptions;

/**
 * Created by App Celestine on 8/1/2017.
 */
public class AuthentificationException extends RuntimeException {
    public AuthentificationException() {
        super();
    }

    public AuthentificationException(String s) {
        super(s);
    }

    public AuthentificationException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public AuthentificationException(Throwable throwable) {
        super(throwable);
    }

    protected AuthentificationException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
