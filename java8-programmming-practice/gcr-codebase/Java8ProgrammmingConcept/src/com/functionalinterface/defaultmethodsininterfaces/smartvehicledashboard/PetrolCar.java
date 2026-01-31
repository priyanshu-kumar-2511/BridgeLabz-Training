package com.functionalinterface.defaultmethodsininterfaces.smartvehicledashboard;

public class PetrolCar implements Vehicle {

    private int speed;

    public PetrolCar(int speed) {
        this.speed = speed;
    }

    @Override
    public void displaySpeed() {
        System.out.println("Petrol Car Speed: " + speed + " km/h");
    }
}
