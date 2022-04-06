package com.envelo.businesstrip.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {

    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
