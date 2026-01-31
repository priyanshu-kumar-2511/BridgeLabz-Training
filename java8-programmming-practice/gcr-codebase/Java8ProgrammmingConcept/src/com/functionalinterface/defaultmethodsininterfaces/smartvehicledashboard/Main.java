package com.functionalinterface.defaultmethodsininterfaces.smartvehicledashboard;

/*3. Smart Vehicle Dashboard
○ Scenario: All vehicles have a method displaySpeed(), but electric vehicles
also display battery percentage.
○ Task: Use default methods to add this new feature.*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = Arrays.asList(
                new PetrolCar(80),
                new ElectricCar(100, 75)
        );

        for (Vehicle vehicle : vehicles) {
            vehicle.displaySpeed();
            vehicle.displayBatteryPercentage();
            System.out.println();
        }
    }
}
