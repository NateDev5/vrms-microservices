package com.nate.vrms.owners.application.exception;

public class DuplicateOwnerException extends RuntimeException {
    public DuplicateOwnerException(String message) { super(message); }
}
