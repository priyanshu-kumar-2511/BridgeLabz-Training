package com.encapsulationandpolymorphism.hospitalmanagement;

import java.util.*;

public class HospitalSystemMain {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        patients.add(new InPatient("P101", "Priyanshu", 22, "Fever", 5));
        patients.add(new OutPatient("P202", "Rahul", 30, "Headache"));

        for (Patient p : patients) {
            System.out.println("--------------------------------");
            System.out.println(p.getPatientDetails());
            System.out.println("Bill Amount: " + p.calculateBill());

            MedicalRecord mr = (MedicalRecord) p;
            mr.addRecord("Diagnosed: " + p.getName());
            mr.viewRecords();
        }
    }
}
