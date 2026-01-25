package com.streams.serialization;

/*4. Serialization - Save and Retrieve an Object
📌 Problem Statement:
Design a Java program that allows a user to store a list of employees in a file using Object Serialization and later retrieve the data from the file.
Requirements:
Create an Employee class with fields: id, name, department, salary.
Serialize the list of employees into a file (ObjectOutputStream).
Deserialize and display the employees from the file (ObjectInputStream).
Handle ClassNotFoundException and IOException.
*/

import java.io.*;
import java.util.*;

public class EmployeeSerializationSystem {

    private static final String FILE_NAME = "employees.ser";

    // Serialize list of employees
    public static void saveEmployees(List<Employee> employees) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    // Deserialize list of employees
    public static List<Employee> loadEmployees() {

        List<Employee> employees = null;

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            employees = (List<Employee>) ois.readObject();
            System.out.println("Employees loaded successfully.");

        } catch (IOException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }

        return employees;
    }

    public static void main(String[] args) {

        // Create employee list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Alice", "HR", 50000));
        employeeList.add(new Employee(2, "Bob", "IT", 70000));
        employeeList.add(new Employee(3, "Carol", "Finance", 65000));

        // Serialize
        saveEmployees(employeeList);

        // Deserialize
        List<Employee> loadedEmployees = loadEmployees();

        // Display
        if (loadedEmployees != null) {
            for (Employee emp : loadedEmployees) {
                System.out.println(emp);
            }
        }
    }
}
