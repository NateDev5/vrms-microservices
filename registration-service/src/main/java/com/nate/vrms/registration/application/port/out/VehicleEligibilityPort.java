package com.nate.vrms.registration.application.port.out;

public interface VehicleEligibilityPort {
    boolean isEligible(String vehicleId);
}
