package com.collectors.employeesalarycategorization;

/*4. Employee Salary Categorization
You have a list of employees with their departments and salaries. Use
Collectors.groupingBy() to group employees by department and calculate the
average salary for each department.

Map<String, Double> avgSalaryByDept = employees.stream()
.collect(Collectors.groupingBy(Employee::getDepartment,
Collectors.averagingDouble(Employee::getSalary)));*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 70000),
                new Employee("Anita", "IT", 90000),
                new Employee("Karan", "HR", 50000),
                new Employee("Meera", "HR", 60000),
                new Employee("Rahul", "Finance", 80000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(
                        Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

        avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " → Average Salary: ₹" + avgSalary));
    }
}
