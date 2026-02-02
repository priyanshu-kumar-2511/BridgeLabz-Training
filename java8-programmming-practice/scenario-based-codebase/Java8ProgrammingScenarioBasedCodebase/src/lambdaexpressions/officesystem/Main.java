package lambdaexpressions.officesystem;

/*Scenario 2: Employee / Office System

1.Use lambda to calculate employee bonus (salary > 30,000).

2.Sort employees by salary using lambda.

3.Use lambda to check promotion eligibility (experience > 3 years).

4.Use lambda to print employee details.

5.Use lambda to compare two employees’ salaries.*/

import java.util.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Priyanshu", "IT", 31000, 4));
		employees.add(new Employee("Saskhi", "IT", 25000, 2));
		employees.add(new Employee("Ankesh", "IT", 28000, 3));
	    
		// Calculate bonus (salary > 30000)
		System.out.println("Calculating Employee Bonus");
		employees.forEach(e -> { 	
			if(e.getSalary() > 30000) {
				double bonus = e.getSalary()* 0.01;
				System.out.println(e.getSalary() + " Bonus: "+ bonus);
			}
		});
		
		// Sort employees by salary using lambda
		System.out.println("\nEmployees Sorted by Salary");
		employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		employees.forEach(System.out::println);
		
		
		// Promotion eligibility (experience > 3 years)
		System.out.println("\nChecking the promotion eligibilty");
		employees.forEach(e -> System.out.println(e.getName() +": "+(e.getExperience()>3 ? " is eligible for promotion" : "is not eligible for promotion")));
		
		// Print employee details using lambda
		System.out.println("\nDisplay Employee Details");
		employees.forEach(System.out::println);
		
		// Compare two employees' salaries using lambda
		System.out.println("\nSalary Comparison");
        BiFunction<Employee, Employee, String> compareSalary =
                (emp1, emp2) -> emp1.getSalary() > emp2.getSalary()
                        ? emp1.getName() + " earns more"
                        : emp2.getName() + " earns more";

        System.out.println(compareSalary.apply(employees.get(1), employees.get(2)));
	}
}
