package com.nate.vrms.cars.domain.exception;

public class VehicleNotValidatedException extends RuntimeException {
    public VehicleNotValidatedException(String message) { super(message); }
}
