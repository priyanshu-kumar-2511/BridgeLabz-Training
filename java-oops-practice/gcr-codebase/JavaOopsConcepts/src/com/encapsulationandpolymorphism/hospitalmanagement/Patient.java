package com.encapsulationandpolymorphism.hospitalmanagement;

public abstract class Patient {

    private String patientId;      // encapsulated
    private String name;
    private int age;

    private String diagnosis;      // sensitive data
    private String medicalHistory = "";

    public Patient(String id, String name, int age, String diagnosis) {
        this.patientId = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Controlled access
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected void addToHistory(String data) {
        medicalHistory += data + "\n";
    }

    protected String getMedicalHistory() {
        return medicalHistory;
    }

    // Common behavior
    public String getPatientDetails() {
        return patientId + " | " + name + " | Age: " + age;
    }

    // Abstract method
    public abstract double calculateBill();
}
