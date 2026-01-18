package com.generics.universitycoursemanagementsystem;

/*3. Multi-Level University Course Management System
Concepts: Generic Classes, Wildcards, Bounded Type Parameters
Problem Statement:
Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
Hints:
Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
Implement a generic class Course<T extends CourseType> to manage different courses.
Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Course<?>> courses = new ArrayList<>();
        List<CourseType> courseTypes = new ArrayList<>();

        while (true) {
            System.out.println("\n===== University Course System =====");
            System.out.println("1. Add Course");
            System.out.println("2. View All Courses");
            System.out.println("3. View Evaluation Types");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter course name: ");
                    String name = sc.nextLine();

                    System.out.println("Select Evaluation Type:");
                    System.out.println("1. Exam Based");
                    System.out.println("2. Assignment Based");
                    System.out.println("3. Research Based");
                    System.out.print("Choice: ");

                    int type = sc.nextInt();

                    if (type == 1) {
                        Course<ExamCourse> c =
                                new Course<>(name, new ExamCourse());
                        courses.add(c);
                        courseTypes.add(c.getCourseType());
                    }
                    else if (type == 2) {
                        Course<AssignmentCourse> c =
                                new Course<>(name, new AssignmentCourse());
                        courses.add(c);
                        courseTypes.add(c.getCourseType());
                    }
                    else if (type == 3) {
                        Course<ResearchCourse> c =
                                new Course<>(name, new ResearchCourse());
                        courses.add(c);
                        courseTypes.add(c.getCourseType());
                    }
                    else {
                        System.out.println("Invalid type");
                    }
                    break;

                case 2:
                    System.out.println("\nOffered Courses:");
                    for (Course<?> c : courses) {
                        System.out.println(c.getDetails());
                    }
                    break;

                case 3:
                    CourseUtils.displayCourseTypes(courseTypes);
                    break;

                case 4:
                    System.out.println("System closed");
                    return;
            }
        }
    }
}
