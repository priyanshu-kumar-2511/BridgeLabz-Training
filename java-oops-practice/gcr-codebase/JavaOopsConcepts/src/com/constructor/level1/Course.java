package com.constructor.level1;

public class Course {
	// Instance variables
    String courseName;
    int duration;       // in months
    double fee;

    // Class variable (shared)
    static String instituteName = "Technocrats Institute of Technology";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Institute : " + instituteName);
        System.out.println("Course    : " + courseName);
        System.out.println("Duration  : " + duration + " months");
        System.out.println("Fee       : " + fee);
        System.out.println();
    }

    // Class (static) method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Data Science", 8, 60000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Change institute for ALL courses
        Course.updateInstituteName("BridgeLabz");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
