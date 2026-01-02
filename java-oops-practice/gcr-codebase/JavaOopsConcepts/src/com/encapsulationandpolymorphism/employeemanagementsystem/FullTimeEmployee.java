package com.encapsulationandpolymorphism.employeemanagementsystem;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double fixedSalary) {
        super(id, name, fixedSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // fixed monthly salary
    }
}