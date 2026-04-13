package com.nate.vrms.owners.application.exception;

public class OwnerNotFoundException extends RuntimeException {
    public OwnerNotFoundException(String message) { super(message); }
}
