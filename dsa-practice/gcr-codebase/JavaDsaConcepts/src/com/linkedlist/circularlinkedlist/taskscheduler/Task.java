package com.linkedlist.circularlinkedlist.taskscheduler;

public class Task {
    int id;
    String name;
    int priority;
    String dueDate;

    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

