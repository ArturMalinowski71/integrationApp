package com.envelo.businesstrip.exceptions;

public class EmailNotSendException extends RuntimeException {

    public EmailNotSendException() {
    }

    public EmailNotSendException(String message) {
        super(message);
    }
}
