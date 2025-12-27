package com.constructor.level1;

public class Vehicle {
	// Instance variables
    String ownerName;
    String vehicleType;

    // Class (static) variable
    static double registrationFee = 5000;   // default fee for all vehicles

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee);
        System.out.println();
    }

    // Class (static) method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Priyanshu", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Change registration fee for ALL vehicles
        Vehicle.updateRegistrationFee(6000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
