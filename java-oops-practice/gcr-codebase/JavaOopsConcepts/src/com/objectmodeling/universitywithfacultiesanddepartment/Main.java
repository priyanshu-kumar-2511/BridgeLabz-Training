package com.objectmodeling.universitywithfacultiesanddepartment;

public class Main {
    public static void main(String[] args) {

        // Faculty created independently (Aggregation)
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Khan");

        // University created
        University uni = new University("Technocrats Institute of Technology");

        // Departments created inside University (Composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Data Science");

        // Faculty added from outside (Aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Show University data
        uni.showUniversity();

        // Delete University
        uni.deleteUniversity();

        System.out.println("\nAfter University deletion:");

        
        f1.showFaculty();
        f2.showFaculty();
    }
}
