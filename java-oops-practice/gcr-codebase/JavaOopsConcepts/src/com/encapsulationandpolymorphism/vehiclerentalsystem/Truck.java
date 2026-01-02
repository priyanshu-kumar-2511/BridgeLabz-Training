package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNo;

    public Truck(String number, double rate, String policy) {
        super(number, "Truck", rate);
        this.insurancePolicyNo = policy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days + 500;  // heavy vehicle surcharge
    }

    @Override
    public double calculateInsurance() {
        return 0.15 * calculateRentalCost(1);   // 15% of daily rent
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNo;
    }
}

