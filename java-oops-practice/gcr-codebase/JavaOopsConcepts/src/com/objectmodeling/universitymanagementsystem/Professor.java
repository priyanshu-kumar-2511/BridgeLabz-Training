package com.objectmodeling.universitymanagementsystem;

public class Professor {

    private int professorId;
    private String name;

    public Professor(int professorId, String name) {
        this.professorId = professorId;
        this.name = name;
    }

    // Communication
    public void assignToCourse(Course course) {
        course.setProfessor(this);
        System.out.println(name + " is assigned to teach " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}