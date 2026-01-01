package com.hierarchicalinheritance.restaurantmanagementsystem;

public class Main {
	public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Math");
        Person p2 = new Student("Amit", 16, "10th");
        Person p3 = new Staff("Ravi", 35, "Administration");

        p1.displayDetails();
        ((Teacher)p1).displayRole();
        System.out.println();

        p2.displayDetails();
        ((Student)p2).displayRole();
        System.out.println();

        p3.displayDetails();
        ((Staff)p3).displayRole();
    }
}
