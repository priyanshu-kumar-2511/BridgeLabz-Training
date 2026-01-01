package com.objectmodeling.hospitaldoctorspatients;

public class HospitalMain {

    public static void main(String[] args) {

        // Doctors
        Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiologist");
        Doctor d2 = new Doctor(102, "Dr. Mehta", "Neurologist");

        // Patients
        Patient p1 = new Patient(1, "Rahul", 25);
        Patient p2 = new Patient(2, "Anjali", 30);
        Patient p3 = new Patient(3, "Amit", 40);

        // Association + Communication
        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);
        d2.consult(p3);
    }
}