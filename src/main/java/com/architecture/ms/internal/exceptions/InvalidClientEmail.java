package com.architecture.ms.internal.exceptions;

public class InvalidClientEmail extends RuntimeException{
    public InvalidClientEmail(String message) {
        super(message);
    }
}
