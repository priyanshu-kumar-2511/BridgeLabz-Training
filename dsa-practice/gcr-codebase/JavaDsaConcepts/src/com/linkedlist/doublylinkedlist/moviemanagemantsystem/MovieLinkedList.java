package com.linkedlist.doublylinkedlist.moviemanagemantsystem;

public class MovieLinkedList{
	
    private Movie head;
    private Movie tail;
    
    // Add at Beginning 
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at End
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at Position
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        Movie temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        Movie newNode = new Movie(title, director, year, rating);

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Delete
    public void remove(String title) {
        Movie temp = head;

        while (temp != null && !temp.title.equals(title))
            temp = temp.next;

        if (temp == null) {
            System.out.println("Movie not found");
            return;
        }

        if (temp == head)
            head = temp.next;

        if (temp == tail)
            tail = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }

    // Search
    public void searchByDirector(String director) {
        Movie temp = head;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director))
                System.out.println(temp.title);
            temp = temp.next;
        }
    }

    public void searchByRating(double rating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.rating >= rating)
                System.out.println(temp.title + " : " + temp.rating);
            temp = temp.next;
        }
    }

    // Display Forward
    public void displayForward() {
        Movie temp = head;

        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        Movie temp = tail;

        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update 
    public void updateRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }
}