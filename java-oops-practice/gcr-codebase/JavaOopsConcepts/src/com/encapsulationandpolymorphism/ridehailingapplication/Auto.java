package com.encapsulationandpolymorphism.ridehailingapplication;

public class Auto extends Vehicle implements GPS {

    private String location = "Unknown";

    public Auto(String id, String driver) {
        super(id, driver, 10);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 20;   // small base fee
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

