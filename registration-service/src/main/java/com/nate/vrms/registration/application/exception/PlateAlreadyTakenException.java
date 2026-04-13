package com.nate.vrms.registration.application.exception;

public class PlateAlreadyTakenException extends RuntimeException {
    public PlateAlreadyTakenException(String message) { super(message); }
}
