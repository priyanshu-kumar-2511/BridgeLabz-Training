package com.encapsulationandpolymorphism.ridehailingapplication;

public class Bike extends Vehicle implements GPS {

    private String location = "Unknown";

    public Bike(String id, String driver) {
        super(id, driver, 8);   // cheaper
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;   // no base fee
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

