package functionalinterface.comparator;

/*Scenario 5: Comparator (Comparison Logic)
1.Compare two students by rank.

2.Compare two employees by salary.

3.Compare two products by price.

4.Compare two strings by length.

5.Compare two bank accounts by balance.*/

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorScenario {

	static class Student {

	    private String name;
	    private int rank;

	    public Student(String name, int rank) {
	        this.name = name;
	        this.rank = rank;
	    }

	    public int getRank() {
	        return rank;
	    }

	    public String getName() {
	        return name;
	    }

	    public String toString() {
	        return name + " (Rank: " + rank + ")";
	    }
	}

    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String toString() {
            return name + " (Salary: ₹" + salary + ")";
        }
    }

    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String toString() {
            return name + " (Price: ₹" + price + ")";
        }
    }

    static class BankAccount {
        String accountHolder;
        double balance;

        BankAccount(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public String toString() {
            return accountHolder + " (Balance: ₹" + balance + ")";
        }
    }

    public static void main(String[] args) {

        /* 1️ Compare Students by Rank */

        List<Student> students = Arrays.asList(
                new Student("Ankesh", 3),
                new Student("Priyanshu", 1),
                new Student("Sakshi", 2)
        );

        students.sort(Comparator.comparingInt(s -> s.rank));
        System.out.println("Students sorted by rank:");
        students.forEach(System.out::println);

        /* 2️ Compare Employees by Salary */

        List<Employee> employees = Arrays.asList(
                new Employee("Ankesh", 50000),
                new Employee("Priyanshu", 75000),
                new Employee("Sakshi", 60000)
        );

        employees.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println("\nEmployees sorted by salary:");
        employees.forEach(System.out::println);

        /* 3️ Compare Products by Price */

        List<Product> products = Arrays.asList(
                new Product("Laptop", 60000),
                new Product("Mobile", 25000),
                new Product("Tablet", 30000)
        );

        products.sort(Comparator.comparingDouble(p -> p.price));
        System.out.println("\nProducts sorted by price:");
        products.forEach(System.out::println);

        /* 4️ Compare Strings by Length */

        List<String> words = Arrays.asList("Java", "SpringBoot", "AI", "Developer");
        words.sort(Comparator.comparingInt(String::length));
        System.out.println("\nStrings sorted by length:");
        words.forEach(System.out::println);

        /* 5️ Compare Bank Accounts by Balance */

        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("Ankesh", 15000),
                new BankAccount("Priyanshu", 30000),
                new BankAccount("Sakshi", 10000)
        );

        accounts.sort(Comparator.comparingDouble(a -> a.balance));
        System.out.println("\nBank Accounts sorted by balance:");
        accounts.forEach(System.out::println);

        /* BONUS: Reverse Order */

        students.sort(Comparator.comparingInt(Student::getRank));
        System.out.println("\nStudents sorted by rank (Descending):");
        students.forEach(System.out::println);
    }
}
