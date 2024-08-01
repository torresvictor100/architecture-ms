package com.architecture.ms.internal.exceptions;

public class InvalidAmount extends RuntimeException{
    public InvalidAmount(String message) {
        super(message);
    }
}
