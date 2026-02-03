package functionalinterface.function;

/*Scenario 2: Function (Data Transformation)

1.Convert student marks into grade (A/B/C) using Function.

2.In payroll system, calculate annual salary from monthly salary.

3.Convert product price into discounted price.

4.Convert employee name into uppercase.

5.Convert Celsius temperature into Fahrenheit.
*/

import java.util.*;
import java.util.function.*;

class Student {
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

class Employee {
	String name;
	double monthlySalary;
	
	public Employee(String name, double monthlySalary) {
		this.name = name;
		this.monthlySalary = monthlySalary;
	}
}

class Ecommerce {
	String productName;
	double price;
	
	public Ecommerce(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
}

class Temperature {
	double temperature;
	
	public Temperature(double temperature) {
		this.temperature = temperature;
	}
}


public class FunctionScenario {
	public static void main(String[] args) {
		
		// student marks into grade
		List<Student> students = new ArrayList<>();
		students.add(new Student("Priyanshu", 79));
		students.add(new Student("Sakshi", 75));
		students.add(new Student("Ankesh", 80));
		
		Function<Student, String> gradeFunction = student -> {
			if(student.marks >= 80) return "A";
			else if (student.marks >= 60) return "B";
			else return "C";
		};
		
		students.forEach(student -> System.out.println(student.name + " Grade: "+ gradeFunction.apply(student)));
	   
		System.out.println();
		
		// employee : calculate annual salary and convert name into uppercase
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Priyanshu", 20000));
		employees.add(new Employee("Sakshi", 15000));
		employees.add(new Employee("Ankesh", 19000));
		
		Function<Employee, Double> annualSalary = employee -> {
			return employee.monthlySalary * 12;
		};
		
		Function<Employee, String> upperCase = employee -> {
			return employee.name.toUpperCase();
		};
		
		employees.forEach(employee -> System.out.println(upperCase.apply(employee) + " : "+ annualSalary.apply(employee)));
		
		System.out.println();
		
		// ecommerce with discounted price
		List<Ecommerce> ecommerces = new ArrayList<>();
		ecommerces.add(new Ecommerce("Mouse", 500));
		ecommerces.add(new Ecommerce("Monitor", 5000));
		ecommerces.add(new Ecommerce("CPU", 50000));
		
		Function<Ecommerce, Double> discountedPrice = ecommerce -> {
			ecommerce.price = ecommerce.price - ecommerce.price*0.01f;
			return ecommerce.price;
		};
		
		ecommerces.forEach(ecommerce -> System.out.println("Price of "+ ecommerce.productName +" after discount is "+ discountedPrice.apply(ecommerce)));
		
		System.out.println();
		
		// temperature convertor
		List<Temperature> temperatures = new ArrayList<>();
		temperatures.add(new Temperature(25.5));
		temperatures.add(new Temperature(30));
		temperatures.add(new Temperature(20));
		
		Function<Temperature, Double> temperatureConvertor = temperature -> {
			return (temperature.temperature*9/5)+32;
		};
		
		temperatures.forEach(temperature -> System.out.println(temperature.temperature + " Celsius into  Fahrenheit "+ temperatureConvertor.apply(temperature)));
		
		System.out.println();
	}
}
