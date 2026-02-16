package com.dbmsjdbc.jdbc.employeemanagementsystem;

/*Exercise 1: Simple CRUD Application
Create a console-based Employee Management System with:
• Add employee
• View all employees
• Update employee salary
• Delete employee
• Search employee by name*/

import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeDAO dao = new EmployeeDAO();

        // Insert
        Employee emp = new Employee("Sakshi Kumari", "MR", 45000);
        dao.addEmployee(emp);

        // Fetch All
        List<Employee> employees = dao.getAllEmployees();

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
