package com.example.demoApplication.Configs.Exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }

    // Optionally, you can provide constructors with more details or causes
    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
