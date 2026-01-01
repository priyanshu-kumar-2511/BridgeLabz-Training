package com.objectmodeling.universitymanagementsystem;

public class UniversityMain {
	public static void main(String[] args) {

        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Anjali");

        Professor p1 = new Professor(101, "Dr. Priyanshu");

        Course c1 = new Course(501, "Data Structures");

        // Communication
        p1.assignToCourse(c1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        c1.showDetails();
    }
}
