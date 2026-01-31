package com.functionalinterface.defaultmethodsininterfaces.smartvehicledashboard;

public class ElectricCar implements Vehicle {

    private int speed;
    private int batteryPercentage;

    public ElectricCar(int speed, int batteryPercentage) {
        this.speed = speed;
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public void displaySpeed() {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery Level: " + batteryPercentage + "%");
    }
}
