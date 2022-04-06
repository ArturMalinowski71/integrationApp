package com.envelo.businesstrip.exceptions;

public class DestinationNotFoundException extends RuntimeException {

    public DestinationNotFoundException() {

    }

    public DestinationNotFoundException(String message) {
        super(message);
    }

}
