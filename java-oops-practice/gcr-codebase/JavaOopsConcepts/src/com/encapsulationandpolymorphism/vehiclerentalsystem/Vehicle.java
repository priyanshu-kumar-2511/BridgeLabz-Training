package com.encapsulationandpolymorphism.vehiclerentalsystem;

public abstract class Vehicle {
    private String vehicleNumber;   // encapsulated
    private String type;
    protected double rentalRate;    // subclasses can access

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);
}
