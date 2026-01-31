package com.functionalinterface.defaultmethodsininterfaces.smartvehicledashboard;

public interface Vehicle {

    void displaySpeed();

    default void displayBatteryPercentage() {
        System.out.println("Battery feature not available for this vehicle.");
    }
}
