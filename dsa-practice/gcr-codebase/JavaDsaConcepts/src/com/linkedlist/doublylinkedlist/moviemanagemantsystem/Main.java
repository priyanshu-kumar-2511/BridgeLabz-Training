package com.linkedlist.doublylinkedlist.moviemanagemantsystem;

/*2. Doubly Linked List: Movie Management System
Problem Statement: Implement a movie management system using a doubly linked list. Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating. Implement the following functionalities:
Add a movie record at the beginning, end, or at a specific position.
Remove a movie record by Movie Title.
Search for a movie record by Director or Rating.
Display all movie records in both forward and reverse order.
Update a movie's Rating based on the Movie Title.
Hint:
Use a doubly linked list where each node has two pointers: one pointing to the next node and the other to the previous node.
Maintain pointers to both the head and tail for easier insertion and deletion at both ends.
For reverse display, start from the tail and traverse backward using the prev pointers.*/

public class Main{
    public static void main(String[] args) {

    	MovieLinkedList list = new MovieLinkedList();

        list.addAtEnd("Ironman", "Priyanshu", 2010, 8.8);
        list.addAtEnd("Avenger", "Priyanshu", 2014, 9.0);
        list.addAtBeginning("Titanic", "Ankesh", 1997, 7.9);

        System.out.println("Forward:");
        list.displayForward();

        list.updateRating("Titanic", 8.5);

        list.remove("Ironman");

        System.out.println("--------------------------------");
        System.out.println("Reverse:");
        list.displayReverse();
        
    }
}

