package com.robot.imagemanager.Exceptions;

public class ImageException extends Exception {
    public ImageException(String message) {
        super(message);
    }

    public ImageException(String message, Throwable cause) {
        super(message, cause);
    }
}