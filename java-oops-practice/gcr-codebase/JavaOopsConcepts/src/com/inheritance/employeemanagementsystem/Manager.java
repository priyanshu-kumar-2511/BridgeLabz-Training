package com.inheritance.employeemanagementsystem;

public class Manager extends Employee {
	int teamSize;
	
	Manager(String name, int id, double salary, int teamSize){
		super(name, id, salary);
		this.teamSize = teamSize; 
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Team Size : "+ teamSize);
	}
}
