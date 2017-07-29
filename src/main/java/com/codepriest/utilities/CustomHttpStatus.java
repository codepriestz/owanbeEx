package com.codepriest.utilities;

/**
 * Created by App Celestine on 7/29/2017.
 */
public enum CustomHttpStatus {
    EXPIRED_SESSION(1020, "Session has Expired");

    private int id;
    private String message;

    CustomHttpStatus(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
