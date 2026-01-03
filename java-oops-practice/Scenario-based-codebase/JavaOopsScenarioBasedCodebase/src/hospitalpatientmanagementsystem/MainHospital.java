package hospitalpatientmanagementsystem;

/*1. Hospital Patient Management System
Scenario: A hospital wants a software module to register patients, assign doctors, and maintain
billing.
Concepts Used:
● Class: Patient, Doctor, Bill
● Constructor: Overloaded for emergency vs. normal patient admission
● Access Modifiers: Keep sensitive data like medicalHistory as private, expose
getSummary() via public
● Interface: Payable with method calculatePayment() implemented in Bill
● Operators: Used to compute discounts, taxes, totals
● OOP:
○ Encapsulation: Private fields with getter/setters
○ Abstraction: Hide billing calculation behind interface
○ Inheritance: InPatient, OutPatient extend Patient
○ Polymorphism: displayInfo() overridden for Doctor, Patient, etc.
*/

public class MainHospital {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Dr. Mehta", "Cardiology");

        Patient p1 = new InPatient("P101", "Priyanshu", 21, 5);
        Patient p2 = new OutPatient("P202", "Rahul", 30);

        p1.assignDoctor(d1);
        p2.assignDoctor(d1);

        System.out.println(p1.displayInfo());
        System.out.println(p2.displayInfo());
        System.out.println(d1.displayInfo());

        Bill bill1 = new Bill(p1, 20000);
        Bill bill2 = new Bill(p2, 3000);

        System.out.println("Bill for P1 = ₹" + bill1.calculatePayment());
        System.out.println("Bill for P2 = ₹" + bill2.calculatePayment());
    }
}
