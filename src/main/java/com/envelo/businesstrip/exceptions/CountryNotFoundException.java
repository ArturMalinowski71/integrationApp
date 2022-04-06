package com.envelo.businesstrip.exceptions;

public class CountryNotFoundException extends RuntimeException {

    public CountryNotFoundException() {

    }

    public CountryNotFoundException(String message) {
        super(message);
    }
}
