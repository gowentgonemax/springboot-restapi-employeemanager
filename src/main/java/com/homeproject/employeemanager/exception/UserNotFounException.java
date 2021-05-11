package com.homeproject.employeemanager.exception;

public class UserNotFounException extends RuntimeException {
    public UserNotFounException(String message) {
        super(message);
    }
}
