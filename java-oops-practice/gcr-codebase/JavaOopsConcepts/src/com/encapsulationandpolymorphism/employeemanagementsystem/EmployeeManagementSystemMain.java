
package com.encapsulationandpolymorphism.employeemanagementsystem;

	import java.util.ArrayList;
	import java.util.List;

	public class EmployeeManagementSystemMain {

	    public static void main(String[] args) {

	        List<Employee> employees = new ArrayList<>();

	        Employee e1 = new FullTimeEmployee(101, "Priyanshu", 50000);
	        Employee e2 = new PartTimeEmployee(102, "Ankesh", 80, 300);

	        e1.assignDepartment("HR");
	        e2.assignDepartment("IT");

	        employees.add(e1);
	        employees.add(e2);

	        // Polymorphism 
	        for (Employee emp : employees) {
	            emp.displayDetails();
	            System.out.println("----------------------");
	        }
	    }
	}
