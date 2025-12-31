package com.objectmodeling.universitywithfacultiesanddepartment;


import java.util.ArrayList;
public class University {
	String universityName;

    // Composition
    ArrayList<Department> departmentList = new ArrayList<>();

    // Aggregation
    ArrayList<Faculty> facultyList = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    // Only University can create departments
    public void addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departmentList.add(dept);
    }

    // Faculty already exists; University just associates with them
    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void showUniversity() {
        System.out.println("\nUniversity: " + universityName);

        System.out.println("Departments:");
        for (Department d : departmentList) {
            d.showDepartment();
        }

        System.out.println("Faculty:");
        for (Faculty f : facultyList) {
            f.showFaculty();
        }
    }

    // Simulate deleting university
    public void deleteUniversity() {
        departmentList.clear();   // departments destroyed
        facultyList.clear();      // only links removed
        System.out.println("\nUniversity deleted. Departments destroyed. Faculty still exists.");
    }
}
