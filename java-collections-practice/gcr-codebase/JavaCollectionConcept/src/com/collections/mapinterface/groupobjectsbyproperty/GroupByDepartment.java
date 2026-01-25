package com.collections.mapinterface.groupobjectsbyproperty;

/*5. Group Objects by Property
Given a list of Employee objects, group them by their department using a Map<Department, List<Employee>>.
Example:
Employees: [Alice (HR), Bob (IT), Carol (HR)] → Output: HR: [Alice, Carol], IT: [Bob].
*/

import java.util.*;

public class GroupByDepartment {

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {

        Map<String, List<Employee>> grouped = new HashMap<>();

        for (Employee emp : employees) {

            grouped.computeIfAbsent(emp.getDepartment(), d -> new ArrayList<>()).add(emp);
        }
        return grouped;
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> result = groupByDepartment(employees);

        for (Map.Entry<String, List<Employee>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
