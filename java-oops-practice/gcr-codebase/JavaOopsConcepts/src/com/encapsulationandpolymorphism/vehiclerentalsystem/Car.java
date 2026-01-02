package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNo;   // hidden

    public Car(String number, double rate, String policy) {
        super(number, "Car", rate);
        this.insurancePolicyNo = policy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.10 * calculateRentalCost(1);   // 10% of daily rent
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNo;
    }
}

