package com.generics.resumescreeningsystem;

/*5. AI-Driven Resume Screening System
Concepts: Generic Classes, Generic Methods, Bounded Type Parameters, Wildcards
Problem Statement:
Develop an AI-Driven Resume Screening System that can process resumes for different job roles like Software Engineer, Data Scientist, and Product Manager while ensuring type safety.
Hints:
Create an abstract class JobRole (SoftwareEngineer, DataScientist, ProductManager).
Implement a generic class Resume<T extends JobRole> to process resumes dynamically.
Use a wildcard method (List<? extends JobRole>) to handle multiple job roles in the screening pipeline.*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Resume<? extends JobRole>> resumePool = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Resume Screening System =====");
            System.out.println("1. Submit Resume");
            System.out.println("2. Run AI Screening");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Candidate Name: ");
                    String name = sc.nextLine();

                    System.out.print("Years of Experience: ");
                    int exp = sc.nextInt();

                    System.out.println("Select Job Role:");
                    System.out.println("1. Software Engineer");
                    System.out.println("2. Data Scientist");
                    System.out.println("3. Product Manager");
                    System.out.print("Choice: ");

                    int roleChoice = sc.nextInt();

                    if (roleChoice == 1) {
                        resumePool.add(new Resume<>(name, exp, new SoftwareEngineer()));
                    } else if (roleChoice == 2) {
                        resumePool.add(new Resume<>(name, exp, new DataScientist()));
                    } else if (roleChoice == 3) {
                        resumePool.add(new Resume<>(name, exp, new ProductManager()));
                    } else {
                        System.out.println("Invalid role");
                    }
                    break;

                case 2:
                    ResumeScreeningUtil.screenResumes(resumePool);
                    break;

                case 3:
                    System.out.println("System closed");
                    return;
            }
        }
    }
}
