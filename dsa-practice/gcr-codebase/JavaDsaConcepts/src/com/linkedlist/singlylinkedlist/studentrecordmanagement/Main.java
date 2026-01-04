package com.linkedlist.singlylinkedlist.studentrecordmanagement;

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
