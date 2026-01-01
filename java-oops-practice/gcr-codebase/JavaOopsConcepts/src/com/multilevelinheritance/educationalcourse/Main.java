package com.multilevelinheritance.educationalcourse;

public class Main {
	public static void main(String[] args) {

        Course c1 = new Course("Java Basics", 40);
        Course c2 = new OnlineCourse("Java Advanced", 50, "Udemy", true);
        Course c3 = new PaidOnlineCourse("Full Stack Java", 80, "Coursera", true, 10000, 20);

        c1.displayInfo();
        System.out.println();
        c2.displayInfo();
        System.out.println();
        c3.displayInfo();
    }
}
