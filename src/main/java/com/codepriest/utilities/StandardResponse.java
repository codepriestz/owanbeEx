/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepriest.utilities;


import java.util.Arrays;
import java.util.List;

/**
 * @author osita
 */
public class StandardResponse {

    private static final int OK = 0;
    private static final int VALIDATION_ERROR = 200;
    private static final int NO_RECORDS_AVAILABLE = 400;
    private static final int CITY_NOT_FOUND = 700;
    private static final int RECORD_ALREADY_EXISTS = 710;
    private static final int NO_AVAILABLE_RECORD = 720;
    private static final int RECORD_NOT_SAVED = 800;
    private static final int SYSTEM_ERROR = 900;
    private static final int INVALID_USER = 1000;
    private static final int UNKNOWN_USER = 1010;
    private static final int INVALID_USERNAME_OR_PASSWORD = 1020;
    private static final int INVALID_CREDENTIALS = 1030;
    private static final int MIN_LENGTH_SIX = 1040;
    private static final int CONFIRM_PASSWORD = 1050;
    private static final int INCORRECT_PASSWORD = 1060;
    private static final int INVALID_REQUEST = 1070;
    private static final int ADMIN_EMAIL_NOT_FOUND = 1100;
    private static final int INVALID_AMOUNT = 1200;
    private static final int INVALID_PAYMENT_METHOD = 1240;
    private static final int INVALID_CODE = 1250;
    private static final int UNABLE_TO_COMPLETE = 1400;
    private static final int ERROR_DURING_PROCESSING = 1410;
    private static final int TOKEN_EXPIRED = 1500;
    private static final int RECORD_ALREADY_APPROVED = 1600;
    private static final int RECORD_ALREADY_UNAPPROVED = 1610;
    private static final int RECORD_NOT_APPROVED = 1620;
    private static final int INVALID_SCHEDULE_TOKEN = 1700;
    private static final int INVALID_CHARGE_TOKEN = 1710;
    private static final int INVALID_ACCOUNT_NUMBER = 1720;
    private static final int CHARGE_NOT_FOUND = 1730;
    private static final int PURCHASE_TOKEN_ALREADY_FORCASTED = 3020;
    private static final int INVALID_FORECAST_TOKEN = 3050;
    private static final int OVERRIDE_VALUE_TOO_LARGE = 3015;
    private static final int INVALID_CUSTOMER_CATEGORY = 3100;
    private static final int UCG_INVALID_RESPONSE = 3200;
    private static final int UCG_PAYMENT_FAILURE = 3300;
    private static final int APPLIANCE_ALREADY_EXISTS = 3400;
    private static final int RECONNECTION_FEE_EXISTS = 3410;
    private static final int CHARGE_EXISTS = 3410;
    private static final int WFM_UNREACHABLE = 4000;
    private static final int VALID_BILL_PAY = 4010;
    private static final int RECEIVABLE_RECORD_NOT_EXIST = 4020;
    private static final int NO_RIGHT = 4030;

    public static Awesome wfmUnreachable() {
        return new Awesome(WFM_UNREACHABLE, "could not reach wfm");
    }

    public static Awesome chargeNotFound() {
        return new Awesome(CHARGE_NOT_FOUND, "no suitable charge");
    }

    public static Awesome inValidPin() {
        return new Awesome(INVALID_CODE, "Wrong Pin!");
    }

    public static Awesome validationErrors(List<String> errors) {
        return new Awesome(VALIDATION_ERROR, "Validation Errors", errors);
    }

    public static Awesome validationErrorConcat(String errors) {
        return new Awesome(VALIDATION_ERROR, errors);
    }

    public static Awesome validationErrors2(List<String> errors) {
        return new Awesome(VALIDATION_ERROR, Arrays.toString(errors.toArray()));
    }

    public static Awesome ok(Object obj) {
        if (obj != null) {
            return new Awesome(OK, "Successful", obj);
        } else {
            return new Awesome(OK, "Successful");
        }
    }

    public static Awesome ok() {
        return ok(null);
    }

    public static Awesome systemError() {
        return new Awesome(SYSTEM_ERROR, "System Error");
    }

    public static Awesome cityNotFound() {
        return new Awesome(CITY_NOT_FOUND, "City Not Found");
    }

    public static Awesome invalidChargeToken() {
        return new Awesome(INVALID_CHARGE_TOKEN, "invalid charge token");
    }

    public static Awesome invalidAccountNumber() {
        return new Awesome(INVALID_ACCOUNT_NUMBER, "invalid account number");
    }

    public static Awesome invalidUser() {
        return new Awesome(INVALID_USER, "Invalid User");
    }

    public static Awesome adminEmailNotFound() {
        return new Awesome(ADMIN_EMAIL_NOT_FOUND, "Admin User not found");
    }

    public static Awesome invalidUserOrPass() {
        return new Awesome(INVALID_USERNAME_OR_PASSWORD, "Invalid username or password");
    }

    public static Awesome noRecords() {
        return new Awesome(NO_RECORDS_AVAILABLE, "Record does not exist");
    }

    public static Awesome UCGInvalidResponse() {
        return new Awesome(UCG_INVALID_RESPONSE, "Invalid response received from UCG");
    }

    public static Awesome UCGPaymentFailure() {
        return new Awesome(UCG_PAYMENT_FAILURE, "UCG payment failed");
    }

    public static Awesome recordNotSaved() {
        return new Awesome(RECORD_NOT_SAVED, "Could not save");
    }

    public static Awesome validationErrors(String errors) {
        return new Awesome(VALIDATION_ERROR, "Validation Errors", errors);
    }

    public static Awesome validationError() {
        return new Awesome(VALIDATION_ERROR, "Validation Errors");
    }

    public static Awesome invalidCredentials() {
        return new Awesome(INVALID_CREDENTIALS, "Invalid Credentials");
    }

    public static Awesome unableToComplete() {
        return new Awesome(UNABLE_TO_COMPLETE, "Unable to complete");
    }

    public static Awesome purchaseTokenAlreadyForecasted() {
        return new Awesome(PURCHASE_TOKEN_ALREADY_FORCASTED, "Sorry this power purchase has  already been forecasted");
    }

    public static Awesome minLengthSix() {
        return new Awesome(MIN_LENGTH_SIX, "Password should be at least 6 characters");
    }

    public static Awesome confirmPassword() {
        return new Awesome(CONFIRM_PASSWORD, "Comfirm password");
    }

    public static Awesome tokenExpired() {
        return new Awesome(TOKEN_EXPIRED, "Token Expired");
    }

    public static Awesome errorDuringProcessing() {
        return new Awesome(ERROR_DURING_PROCESSING, "Error during processing");
    }

    public static Awesome invalidAmount() {
        return new Awesome(INVALID_AMOUNT, "Invalid amount");
    }

    public static Awesome unknownUser() {
        return new Awesome(UNKNOWN_USER, "Unknown user");
    }

    public static Awesome invalidPaymentMethod() {
        return new Awesome(INVALID_PAYMENT_METHOD, "Invalid payment method");
    }

    public static Awesome passwordIncorrect() {
        return new Awesome(INCORRECT_PASSWORD, "Incorrect password");
    }

    public static Awesome invalidRequest() {
        return new Awesome(INVALID_REQUEST, "Invalid request");
    }

    public static Awesome recordAlreadyExists() {
        return new Awesome(RECORD_ALREADY_EXISTS, "A record with this name already exists ");
    }

    public static Awesome codeAlreadyExists() {
        return new Awesome(INVALID_CODE, "Duplicate code is not allowed");

    }

    public static Awesome noAvailableRecord() {
        return new Awesome(NO_AVAILABLE_RECORD, "No available record");
    }

    public static Awesome noRight() {
        return new Awesome(NO_RIGHT, "User has no right");
    }

    public static Awesome invalidForecastToken() {
        return new Awesome(INVALID_FORECAST_TOKEN, "Invalid forecast  token");
    }

    public static Awesome overrideValueTooLarge() {
        return new Awesome(OVERRIDE_VALUE_TOO_LARGE, "Override value too large");
    }

    public static Awesome invalidCustomerCategorySelected() {
        return new Awesome(INVALID_CUSTOMER_CATEGORY, "Invalid customer category passed");
    }

    public static Awesome recordAlreadyApproved() {
        return new Awesome(RECORD_ALREADY_APPROVED, "This record has already been approved");
    }

    public static Awesome recordAlreadyUnapproved() {
        return new Awesome(RECORD_ALREADY_UNAPPROVED, "This record has already been unapproved");
    }

    public static Awesome invalidScheduleToken() {
        return new Awesome(INVALID_SCHEDULE_TOKEN, "Invalid schedule  token");
    }

    public static Awesome validBillPay() {
        return new Awesome(VALID_BILL_PAY, "bill pay wasnt set to invalid");

    }

    public static Awesome applianceAlreadyExists() {
        return new Awesome(APPLIANCE_ALREADY_EXISTS, "This appliance has already been added for this customer. Use update instead to update the count ");
    }

    public static Awesome receivableRecordDoesNotExist() {
        return new Awesome(RECEIVABLE_RECORD_NOT_EXIST, "Receivable record does not exist ");
    }

    public static Awesome reconnectionFeeExists() {
        return new Awesome(RECONNECTION_FEE_EXISTS, "Reconnection fee exists ");
    }

    public static Awesome chargeTypeHasCharge() {
        return new Awesome(CHARGE_EXISTS, "Charge type has Charge(s) ");
    }

    public static Awesome recordNotApproved() {
        return new Awesome(RECORD_NOT_APPROVED, "Approval failed for this record ");
    }

    public static Awesome mandatoryField(String field) {
        return new Awesome(RECORD_NOT_APPROVED, field);
    }

}
