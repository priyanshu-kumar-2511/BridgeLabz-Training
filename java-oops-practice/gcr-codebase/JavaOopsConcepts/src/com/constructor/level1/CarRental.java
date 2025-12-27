package com.constructor.level1;

public class CarRental {
	String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Default constructor
    public CarRental() {
        this("Ankesh", "Standard", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateCost();
    }

    // Copy constructor
    public CarRental(CarRental c) {
        this(c.customerName, c.carModel, c.rentalDays);
    }

    // Cost calculation method
    private void calculateCost() {
        double ratePerDay;

        // Different prices for different models
        if (carModel.equalsIgnoreCase("SUV"))
            ratePerDay = 3000;
        else if (carModel.equalsIgnoreCase("Sedan"))
            ratePerDay = 2000;
        else
            ratePerDay = 1500;   // Standard

        totalCost = ratePerDay * rentalDays;
    }

    void display() {
        System.out.println("Customer : " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Days     : " + rentalDays);
        System.out.println("Total Rs : " + totalCost);
        System.out.println();
    }

    public static void main(String[] args) {

        CarRental r1 = new CarRental(); 
        CarRental r2 = new CarRental("Priyanshu", "SUV", 3);
        CarRental r3 = new CarRental(r2);

        r1.display();
        r2.display();
        r3.display();
    }
}
