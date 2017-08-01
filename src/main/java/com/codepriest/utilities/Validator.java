package com.codepriest.utilities;

/**
 * Created by App Celestine on 8/1/2017.
 */
public class Validator {
    public static Boolean isPhoneNumber(String phone) {
        return phone.matches("[0]\\d{8}") || phone.matches("[0][789][01]\\d{8}") || phone.matches("[+234][789][01]\\d{8}");
    }

    public static Boolean isInteger(String integer) {
        try {
            Integer.parseInt(integer);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
