package com.linkedlist.singlylinkedlist.studentrecordmanagement;

/*1. Singly Linked List: Student Record Management
Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
Add a new student record at the beginning, end, or at a specific position.
Delete a student record by Roll Number.
Search for a student record by Roll Number.
Display all student records.
Update a student's grade based on their Roll Number.
Hint:
Use a singly linked list where each node contains student information and a pointer to the next node.
The head of the list will represent the first student, and the last node’s next pointer will be null.
Update the next pointers when inserting or deleting nodes.
*/

public class Main{
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtEnd(2, "Priyanshu", 21, "A+");
        list.addAtEnd(3, "Ankesh", 19, "B");
        System.out.println("");
        list.display();
        
        list.addAtBeginning(1, "Sakshi", 20, "A+");
         
        System.out.println("");
        list.display();

        System.out.println("");
        list.search(2);
        list.updateGrade(3, "A");

        System.out.println("");
        list.delete(1);

        System.out.println("After Deletion:");
        list.display();
    }
}
