package com.nate.vrms.registration.domain.exception;

public class RegistrationNotActiveException extends RuntimeException {
    public RegistrationNotActiveException(String message) { super(message); }
}
