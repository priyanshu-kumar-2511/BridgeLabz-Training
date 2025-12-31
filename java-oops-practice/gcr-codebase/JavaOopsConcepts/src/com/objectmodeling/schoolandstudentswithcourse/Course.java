package com.objectmodeling.schoolandstudentswithcourse;

import java.util.ArrayList;
public class Course {
	String courseName;
    ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showStudents() {
        System.out.println("\nStudents in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println(s.studentName);
        }
    }
}
