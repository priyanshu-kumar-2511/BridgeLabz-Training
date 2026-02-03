package functionalinterface.predicate;

/*Scenario 1: Predicate (Condition Checking)

1.In a student system, use a Predicate to check if a student is eligible for exam (attendance ≥ 75%).

2.In an employee system, check if salary is greater than 30,000 using Predicate.

3.In a bank application, validate whether withdrawal amount is valid using Predicate.

4.In an e-commerce app, check if order amount is eligible for free delivery.

5.Use Predicate to check whether a number is even or odd.*/

import java.util.*;
import java.util.function.*;

class Student {
	String name;
	double attendance;

	public Student(String name, double attendance) {
		this.name = name;
		this.attendance = attendance;
	}
}

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

class Bank {
	String accountHolder;
	double balance;
	
	public Bank(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
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

class CheckNumber{
	int number;
	
	public CheckNumber(int number) {
		this.number = number;
	}
}

public class PredicateFuntion {
	public static void main(String [] args) {
		
		// Student System
		List<Student> students = new ArrayList<>();
		students.add(new Student("Priyanshu", 75));
		students.add(new Student("Sakshi", 75));
		students.add(new Student("Ankesh", 70));
		
		Predicate<Student> eligibleForExam = student -> student.attendance >=75;
		students.forEach(student -> System.out.println(student.name + " eligible for exam? "+ eligibleForExam.test(student)));
		
		System.out.println();
		
		// Employee System
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Priyanshu", 30000));
		employees.add(new Employee("Sakshi", 31000));
		employees.add(new Employee("Ankesh", 29000));
		
		Predicate<Employee> salaryGreaterThan30000 = employee -> employee.salary >= 30000;
		employees.forEach(employee -> System.out.println(employee.name + " salary is more than 30000? "+ salaryGreaterThan30000.test(employee)));
		
		System.out.println();
		
		// Bank System
		List<Bank> accountHolders = new ArrayList<>();
		accountHolders.add(new Bank("Priyanshu", 10000));
		accountHolders.add(new Bank("Ankesh", 5000));
		accountHolders.add(new Bank("Sakshi", 11000));
		
		Predicate<Bank> withdrawalAmount = accountHolder -> accountHolder.balance >= 6000;
		accountHolders.forEach(accountHolder -> System.out.println(accountHolder.accountHolder +" balance is sufficient? "+ withdrawalAmount.test(accountHolder)));
		
		System.out.println();
		
		// E-commerce
		List<Ecommerce> ecommerces = new ArrayList<>();
		ecommerces.add(new Ecommerce("Mouse", 500));
		ecommerces.add(new Ecommerce("Monitor", 5000));
		ecommerces.add(new Ecommerce("CPU", 50000));
		
		Predicate<Ecommerce> eligibleForFreeDelivery = ecommerce -> ecommerce.price >= 5000;
		ecommerces.forEach(ecommerce -> System.out.println(ecommerce.productName +" is eligible for free delivery? "+ eligibleForFreeDelivery.test(ecommerce)));
		
		System.out.println();
		
		// Number is even or odd
		List<CheckNumber> checkNumber = new ArrayList<>();
		
		checkNumber.add(new CheckNumber(20));
		checkNumber.add(new CheckNumber(19));
		checkNumber.add(new CheckNumber(15));
		checkNumber.add(new CheckNumber(16));
		
		Predicate<CheckNumber> numberIsEvenOdd = checknumber -> checknumber.number %2 == 0;
		checkNumber.forEach(checknumber -> System.out.println(checknumber.number + " number is Even? "+ numberIsEvenOdd.test(checknumber)));
		
	}
}