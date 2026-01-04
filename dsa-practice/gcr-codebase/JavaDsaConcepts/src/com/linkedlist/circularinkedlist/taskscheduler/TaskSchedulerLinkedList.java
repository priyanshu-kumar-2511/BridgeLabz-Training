package com.linkedlist.circularinkedlist.taskscheduler;

public class TaskSchedulerLinkedList{

    private Task head;
    private Task tail;
    private Task current;

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String date) {
        Task newNode = new Task(id, name, priority, date);

        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    // Add at End
    public void addAtEnd(int id, String name, int priority, String date) {
        Task newNode = new Task(id, name, priority, date);

        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }
    
    // Add at Specific Position
    public void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        Task temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        Task newNode = new Task(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail)
            tail = newNode;
    }

    // Remove by task Id
    public void remove(int id) {
        if (head == null) return;

        Task temp = head, prev = tail;

        do {
            if (temp.id == id) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // View Current Task & Move Next
    public void viewNext() {
        if (current == null)
            current = head;

        System.out.println("Executing: " + current.name);
        current = current.next;
    }

    // Search By Priority
    public void searchByPriority(int p) {
        if (head == null) return;

        Task temp = head;
        do {
            if (temp.priority == p)
                System.out.println(temp.name + " | " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Display
    public void display() {
        if (head == null) return;

        Task temp = head;
        do {
            System.out.println(temp.id + " | " + temp.name + " | " + temp.priority + " | " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}

