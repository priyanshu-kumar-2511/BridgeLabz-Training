package com.encapsulationandpolymorphism.vehiclerentalsystem;

import java.util.*;
public class VehicleRentalSystemMain {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1000, "CAR-INS-999"));
        vehicles.add(new Bike("BIKE202", 300, "BIKE-INS-555"));
        vehicles.add(new Truck("TRUCK303", 2500, "TRUCK-INS-777"));

        int days = 3;

        for (Vehicle v : vehicles) {
            System.out.println("---------------------------------");
            System.out.println("Vehicle No: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());
            System.out.println("Rental for " + days + " days = " + v.calculateRentalCost(days));

            Insurable ins = (Insurable) v;
            System.out.println("Insurance Cost = " + ins.calculateInsurance());
            System.out.println(ins.getInsuranceDetails());
        }
    }
}
