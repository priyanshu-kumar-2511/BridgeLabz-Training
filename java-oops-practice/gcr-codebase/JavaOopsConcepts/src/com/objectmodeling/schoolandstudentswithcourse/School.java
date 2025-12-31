package com.objectmodeling.schoolandstudentswithcourse;

import java.util.ArrayList;
public class School {

    String schoolName;
    ArrayList<Student> studentList = new ArrayList<>();   // Aggregation

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void showStudents() {
        System.out.println("\nStudents in " + schoolName + ":");
        for (Student s : studentList) {
            System.out.println(s.studentName);
        }
    }
}

