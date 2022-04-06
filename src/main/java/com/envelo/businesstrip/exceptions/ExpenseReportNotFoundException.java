package com.envelo.businesstrip.exceptions;

public class ExpenseReportNotFoundException extends RuntimeException {

    public ExpenseReportNotFoundException() {

    }

    public ExpenseReportNotFoundException(String message) {
        super(message);
    }
}
