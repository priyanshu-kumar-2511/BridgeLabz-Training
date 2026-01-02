package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNo;

    public Bike(String number, double rate, String policy) {
        super(number, "Bike", rate);
        this.insurancePolicyNo = policy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * calculateRentalCost(1);   // 5% of daily rent
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNo;
    }
}
