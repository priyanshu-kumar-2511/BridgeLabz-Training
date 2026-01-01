package com.objectmodeling.hospitaldoctorspatients;

public class Doctor {

    private int doctorId;
    private String name;
    private String specialization;

    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    // Communication Method
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " (" + specialization + ") is consulting Patient " + patient.getName());
    }

    public String getName() {
        return name;
    }
}
