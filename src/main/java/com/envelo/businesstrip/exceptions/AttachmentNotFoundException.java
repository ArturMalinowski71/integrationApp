package com.envelo.businesstrip.exceptions;

public class AttachmentNotFoundException extends RuntimeException {

    public AttachmentNotFoundException() {

    }

    public AttachmentNotFoundException(String message) {
        super(message);
    }
}
