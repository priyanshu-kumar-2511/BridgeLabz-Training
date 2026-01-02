package com.encapsulationandpolymorphism.hospitalmanagement;

public class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge = 2000;

    public InPatient(String id, String name, int age, String diagnosis, int days) {
        super(id, name, age, diagnosis);
        this.daysAdmitted = days;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        addToHistory("InPatient: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println(getMedicalHistory());
    }
}
