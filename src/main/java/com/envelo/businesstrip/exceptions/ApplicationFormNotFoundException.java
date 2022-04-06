package com.envelo.businesstrip.exceptions;

public class ApplicationFormNotFoundException extends RuntimeException{

    public ApplicationFormNotFoundException() {

    }

    public ApplicationFormNotFoundException(String message) {
        super(message);
    }
}
