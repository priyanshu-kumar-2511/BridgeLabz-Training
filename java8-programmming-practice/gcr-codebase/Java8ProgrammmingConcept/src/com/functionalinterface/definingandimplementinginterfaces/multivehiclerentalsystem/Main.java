package com.functionalinterface.definingandimplementinginterfaces.multivehiclerentalsystem;

/*2. Multi-Vehicle Rental System
○ Scenario: Cars, bikes, and buses share rent() and returnVehicle()
methods.
○ Task: Use interface-based design.*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Rental> vehicles = Arrays.asList(
                new Car("Toyota"),
                new Bike("Yamaha"),
                new Bus("Volvo")
        );

        for (Rental vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            vehicle.rent();
        }

        System.out.println();

        for (Rental vehicle : vehicles) {
            vehicle.returnVehicle();
        }
    }
}
