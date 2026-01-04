package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class Student {
    int roll;
    String name;
    int age;
    String grade;
    Student next;   // pointer to next node

    Student(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
