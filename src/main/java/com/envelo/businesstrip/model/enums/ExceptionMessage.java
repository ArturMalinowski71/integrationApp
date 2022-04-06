package com.envelo.businesstrip.model.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ExceptionMessage {
    ADVANCE_PAYMENT_ID_NOT_FOUND("AdvancePayment not found. Id: "),
    APPLICATION_FORM_ID_NOT_FOUND("ApplicationForm not found. Id: "),
    ATTACHMENT_ID_NOT_FOUND("Attachment not found. Id: "),
    COUNTRY_ID_NOT_FOUND("Country not found. Id: "),
    DESTINATION_ID_NOT_FOUND("Destination not found. Id: "),
    EMAIL_NOT_SEND("Email not send"),
    EXPENSE_REPORT_ID_NOT_FOUND("ExpenseReport not found. Id: "),
    OWN_TRANSPORT_ID_NOT_FOUND("OwnTransport not found. Id: "),
    OWN_TRANSPORT_TYPE_ID_NOT_FOUND("OwnTransportType not found. Id: "),
    POLISH_CITY_ID_NOT_FOUND("PolishCity not found. Id: "),
    TRANSPORT_ID_NOT_FOUND("Transport not found. Id: "),
    USER_ID_NOT_FOUND("User not found. Id: "),
    USER_USERNAME_NOT_FOUND("User not found. Username: ");

    private final String message;

    public String getMessage(String key) {
        return this.message + key;
    }

    public String getMessage() {
        return this.message;
    }

}
