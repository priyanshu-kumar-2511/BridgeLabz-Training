package com.generics.universitycoursemanagementsystem;

public class Course<T extends CourseType> {

    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getDetails() {
        return courseName + " | Evaluation: " + courseType.getEvaluationMethod();
    }

    public CourseType getCourseType() {
        return courseType;
    }
}
