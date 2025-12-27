package com.constructor.level1;

public class PostgraduateStudent extends Student {

    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void display() {
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Name           : " + name);
        System.out.println("CGPA           : " + getCGPA());
        System.out.println("Specialization : " + specialization);
        System.out.println();
    }

    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent(130, "Priyanshu", 8.5, "DS");

        p.display();
        p.setCGPA(9.1);
        System.out.println("Updated CGPA: " + p.getCGPA());
    }
}
