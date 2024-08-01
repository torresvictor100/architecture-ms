package com.architecture.ms.internal.exceptions;

public class AccountAlready extends RuntimeException{
    public AccountAlready(String message) {
        super(message);
    }
}
