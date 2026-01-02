package com.encapsulationandpolymorphism.hospitalmanagement;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee = 500;

    public OutPatient(String id, String name, int age, String diagnosis) {
        super(id, name, age, diagnosis);
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addToHistory("OutPatient: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println(getMedicalHistory());
    }
}
