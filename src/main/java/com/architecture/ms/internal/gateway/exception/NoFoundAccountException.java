package com.architecture.ms.internal.gateway.exception;

public class NoFoundAccountException extends RuntimeException{
    public NoFoundAccountException(String message) {
        super(message);
    }
}
