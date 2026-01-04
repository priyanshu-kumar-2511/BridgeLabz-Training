package com.linkedlist.doublylinkedlist.librarymanagemantsystem;

public class LibraryLinkedList{
    private Book head;
    private Book tail;
 
    // Add at Beginning
    public void addAtBeginning(String t, String a, String g, int id, boolean avail) {
        Book newNode = new Book(t, a, g, id, avail);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at End
    public void addAtEnd(String t, String a, String g, int id, boolean avail) {
        Book newNode = new Book(t, a, g, id, avail);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at Position
    public void addAtPosition(int pos, String t, String a, String g, int id, boolean avail) {
        if (pos == 1) {
            addAtBeginning(t, a, g, id, avail);
            return;
        }

        Book temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(t, a, g, id, avail);
            return;
        }

        Book newNode = new Book(t, a, g, id, avail);

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove
    public void remove(int id) {
        Book temp = head;

        while (temp != null && temp.bookId != id)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Book not found");
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

    // Search By Title
    public void searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title))
                System.out.println(temp.title + " by " + temp.author);
            temp = temp.next;
        }
    }

    // Search By Author
    public void searchByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author))
                System.out.println(temp.title);
            temp = temp.next;
        }
    }

    // Update
    public void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
    }

    // Display Forward
    public void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + " | " + temp.title + " | " + temp.available);
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + " | " + temp.title + " | " + temp.available);
            temp = temp.prev;
        }
    }

    // Count Books
    public int count() {
        int c = 0;
        Book temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }
}

