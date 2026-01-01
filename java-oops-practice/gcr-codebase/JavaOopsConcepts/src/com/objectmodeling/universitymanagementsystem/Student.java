package com.objectmodeling.universitymanagementsystem;

public class Student {

    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Communication
    public void enrollCourse(Course course) {
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}
