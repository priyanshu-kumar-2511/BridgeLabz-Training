package com.functionalinterface.definingandimplementinginterfaces.multivehiclerentalsystem;

public class Bike implements Rental {

    private String model;
    private boolean rented;

    public Bike(String model) {
        this.model = model;
        this.rented = false;
    }

    @Override
    public void rent() {
        if (!rented) {
            rented = true;
            System.out.println("Bike " + model + " rented successfully.");
        } else {
            System.out.println("Bike " + model + " is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (rented) {
            rented = false;
            System.out.println("Bike " + model + " returned successfully.");
        } else {
            System.out.println("Bike " + model + " was not rented.");
        }
    }

    @Override
    public String getVehicleDetails() {
        return "Bike: " + model;
    }
}
