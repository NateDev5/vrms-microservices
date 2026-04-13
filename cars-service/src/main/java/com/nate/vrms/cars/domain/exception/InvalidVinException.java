package com.nate.vrms.cars.domain.exception;

public class InvalidVinException extends RuntimeException {
    public InvalidVinException(String message) { super(message); }
}
