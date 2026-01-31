package com.functionalinterface.definingandimplementinginterfaces.multivehiclerentalsystem;

public class Bus implements Rental {

    private String model;
    private boolean rented;

    public Bus(String model) {
        this.model = model;
        this.rented = false;
    }

    @Override
    public void rent() {
        if (!rented) {
            rented = true;
            System.out.println("Bus " + model + " rented successfully.");
        } else {
            System.out.println("Bus " + model + " is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (rented) {
            rented = false;
            System.out.println("Bus " + model + " returned successfully.");
        } else {
            System.out.println("Bus " + model + " was not rented.");
        }
    }

    @Override
    public String getVehicleDetails() {
        return "Bus: " + model;
    }
}
