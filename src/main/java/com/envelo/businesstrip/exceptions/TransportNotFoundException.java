package com.envelo.businesstrip.exceptions;

public class TransportNotFoundException extends RuntimeException{

    public TransportNotFoundException() {

    }

    public TransportNotFoundException(String message) {
        super(message);
    }
}
