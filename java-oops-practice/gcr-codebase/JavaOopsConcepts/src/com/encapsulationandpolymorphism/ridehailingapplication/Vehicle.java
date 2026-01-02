package com.encapsulationandpolymorphism.ridehailingapplication;

public abstract class Vehicle {

    private String vehicleId;     // encapsulated
    private String driverName;
    protected double ratePerKm;   // subclasses need this

    public Vehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    // Controlled access
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    // Common behavior
    public String getVehicleDetails() {
        return vehicleId + " | Driver: " + driverName + " | Rate/km: " + ratePerKm;
    }

    // Abstract behavior
    public abstract double calculateFare(double distance);
}
