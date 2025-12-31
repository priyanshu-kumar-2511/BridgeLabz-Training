package com.objectmodeling.schoolandstudentswithcourse;

import java.util.ArrayList;
public class Student {
	String studentName;
    ArrayList<Course> courseList = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    // Association happens here
    public void enroll(Course course) {
        courseList.add(course);
        course.addStudent(this);   // link both ways
    }

    public void showCourses() {
        System.out.println("\nCourses of " + studentName + ":");
        for (Course c : courseList) {
            System.out.println(c.courseName);
        }
    }
}
