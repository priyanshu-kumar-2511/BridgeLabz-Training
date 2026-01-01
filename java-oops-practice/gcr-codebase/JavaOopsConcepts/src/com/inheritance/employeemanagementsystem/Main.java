package com.inheritance.employeemanagementsystem;

public class Main {
	public static void main(String[] args) {
		
		Employee e1 = new Manager("Priyanhu", 130, 130000, 5);
		Employee e2 = new Developer("Ankesh", 41, 60000, "Java");
		Employee e3 = new Intern("Aman", 32, 30000, "Python");
		
		e1.displayDetails();
		System.out.println();
		
        e2.displayDetails();
        System.out.println();
        
        e3.displayDetails();
	}
}
