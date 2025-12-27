package com.constructor.level1;

public class Manager extends EmployeeRecord {

    String name;

    public Manager(int employeeID, String department, double salary, String name) {
        super(employeeID, department, salary);
        this.name = name;
    }

    public void display() {
        System.out.println("Manager Name : " + name);
        System.out.println("Employee ID  : " + employeeID);    // public
        System.out.println("Department   : " + department);   // protected
        System.out.println("Salary       : " + getSalary());  // private via getter
        System.out.println();
    }

    public static void main(String[] args) {

        Manager m = new Manager(130, "IT", 75000, "Priyanshu");

        m.display();

        // Modify salary
        m.setSalary(85000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}
