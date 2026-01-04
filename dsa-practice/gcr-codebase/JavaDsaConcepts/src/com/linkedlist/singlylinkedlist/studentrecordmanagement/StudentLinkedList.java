package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {

    private Student head;
    
    // Add at Beginning
    public void addAtBeginning(int roll, String name, int age, String grade) {
        Student newNode = new Student(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at End
    public void addAtEnd(int roll, String name, int age, String grade) {
        Student newNode = new Student(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        Student temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Add at Specific Position
    public void addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        Student newNode = new Student(roll, name, age, grade);
        Student temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete 
    public void delete(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;

        if (temp.next == null)
            System.out.println("Student not found");
        else
            temp.next = temp.next.next;
    }

    // Search
    public void search(int roll) {
        Student temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.name + " Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }
 
    // Update
    public void updateGrade(int roll, String newGrade) {
        Student temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // Display All
    public void display() {
        Student temp = head;

        while (temp != null) {
            System.out.println(
                temp.roll + " | " + temp.name + " | " + temp.age + " | " + temp.grade
            );
            temp = temp.next;
        }
    }
}
