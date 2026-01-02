package com.encapsulationandpolymorphism.ridehailingapplication;

public class RideService {
    public static void printFare(Vehicle v, double distance) {
        System.out.println("---------------------------------");
        System.out.println(v.getVehicleDetails());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare = ₹" + v.calculateFare(distance));
    }
}

