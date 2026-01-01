package com.objectmodeling.universitymanagementsystem;

import java.util.ArrayList;

public class Course {

    private int courseId;
    private String courseName;
    private Professor professor;                  // Association
    private ArrayList<Student> students;          // Aggregation

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void showDetails() {
        System.out.println("\nCourse: " + courseName);

        if (professor != null)
            System.out.println("Professor: " + professor.getName());

        System.out.println("Students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}
