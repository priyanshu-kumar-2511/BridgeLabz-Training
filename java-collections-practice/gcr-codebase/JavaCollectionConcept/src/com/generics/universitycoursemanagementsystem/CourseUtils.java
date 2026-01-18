package com.generics.universitycoursemanagementsystem;

import java.util.List;

public class CourseUtils {

    public static void displayCourseTypes(List<? extends CourseType> list) {
        System.out.println("\nEvaluation Types:");
        for (CourseType c : list) {
            System.out.println("- " + c.getEvaluationMethod());
        }
    }
}
