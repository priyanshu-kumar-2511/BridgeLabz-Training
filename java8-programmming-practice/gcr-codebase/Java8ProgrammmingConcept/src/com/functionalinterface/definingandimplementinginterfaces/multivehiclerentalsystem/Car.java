package com.functionalinterface.definingandimplementinginterfaces.multivehiclerentalsystem;

public class Car implements Rental {
	private String model;
    private boolean rented;

    public Car(String model) {
        this.model = model;
        this.rented = false;
    }

    @Override
    public void rent() {
        if (!rented) {
            rented = true;
            System.out.println("Car " + model + " rented successfully.");
        } else {
            System.out.println("Car " + model + " is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (rented) {
            rented = false;
            System.out.println("Car " + model + " returned successfully.");
        } else {
            System.out.println("Car " + model + " was not rented.");
        }
    }

    @Override
    public String getVehicleDetails() {
        return "Car: " + model;
    }
}
