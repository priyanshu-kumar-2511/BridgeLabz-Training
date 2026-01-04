package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryLinkedList{
    private Item head;
    
    // Add at Beginning
    public void addAtBeginning(String name, int id, int qty, double price) {
        Item newNode = new Item(name, id, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at End
    public void addAtEnd(String name, int id, int qty, double price) {
        Item newNode = new Item(name, id, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        Item temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Add at specific position
    public void addAtPosition(int pos, String name, int id, int qty, double price) {
        if (pos == 1) {
            addAtBeginning(name, id, qty, price);
            return;
        }

        Item temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) return;

        Item newNode = new Item(name, id, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove
    public void remove(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.id != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Update
    public void updateQty(int id, int newQty) {
        Item temp = head;

        while (temp != null) {
            if (temp.id == id) {
                temp.qty = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by ID
    public void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id)
                System.out.println(temp.name + " " + temp.qty + " " + temp.price);
            temp = temp.next;
        }
    }

    // Search by Name
    public void searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                System.out.println(temp.id + " " + temp.qty + " " + temp.price);
            temp = temp.next;
        }
    }

    // Sum of total inventory value
    public double totalValue() {
        double sum = 0;
        Item temp = head;

        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        return sum;
    }

    // Display
    public void display() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.id + " | " + temp.name + " | " + temp.qty + " | " + temp.price);
            temp = temp.next;
        }
    }
}

    
    
    
