package com.nate.vrms.registration.application.port.out;

public interface OwnerEligibilityPort {
    boolean isEligible(String ownerId);
}
