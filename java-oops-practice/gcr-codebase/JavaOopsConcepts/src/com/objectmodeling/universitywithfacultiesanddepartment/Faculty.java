package com.objectmodeling.universitywithfacultiesanddepartment;

public class Faculty {
	String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void showFaculty() {
        System.out.println("Faculty: " + facultyName);
    }
}
