package com.constructor.level1;

public class EmployeeRecord {

    public int employeeID;        // public
    protected String department; // protected
    private double salary;        // private

    public EmployeeRecord(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }
}
