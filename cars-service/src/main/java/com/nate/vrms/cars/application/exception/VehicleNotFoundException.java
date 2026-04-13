package com.nate.vrms.cars.application.exception;

public class VehicleNotFoundException extends RuntimeException {
    public VehicleNotFoundException(String message) { super(message); }
}
