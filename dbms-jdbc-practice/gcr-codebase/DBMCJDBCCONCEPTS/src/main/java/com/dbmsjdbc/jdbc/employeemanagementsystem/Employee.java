package com.dbmsjdbc.jdbc.employeemanagementsystem;

import java.time.LocalDateTime;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private LocalDateTime createdAt;

    // Constructor for insert 
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Constructor for fetching from DB
    public Employee(int id, String name, String department, double salary, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.createdAt = createdAt;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return "Employee [id=" + id +", name=" + name +", department=" + department +", salary=" + salary +", createdAt=" + createdAt + "]";
    }
}
