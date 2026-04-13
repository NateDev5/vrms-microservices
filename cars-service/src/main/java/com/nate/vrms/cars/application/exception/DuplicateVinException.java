package com.nate.vrms.cars.application.exception;

public class DuplicateVinException extends RuntimeException {
    public DuplicateVinException(String message) { super(message); }
}
