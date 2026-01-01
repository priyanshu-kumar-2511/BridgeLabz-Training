package com.inheritance.employeemanagementsystem;

public class Intern extends Employee {
	String programmingLanguage;
	
	Intern(String name, int id, double salary, String programmingLanguage){
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language : "+ programmingLanguage);
	}
}
