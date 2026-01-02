package com.encapsulationandpolymorphism.ridehailingapplication;

public class RideHailingMain {
    public static void main(String[] args) {

        Vehicle car = new Car("CAR101", "Priyanshu");
        Vehicle bike = new Bike("BIKE202", "Rahul");
        Vehicle auto = new Auto("AUTO303", "Amit");

        RideService.printFare(car, 10);
        RideService.printFare(bike, 10);
        RideService.printFare(auto, 10);
    }
}
