package com.linkedlist.circularinkedlist.taskscheduler;

/*3. Circular Linked List: Task Scheduler
Problem Statement: Create a task scheduler using a circular linked list. Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date. Implement the following functionalities:
Add a task at the beginning, end, or at a specific position in the circular list.
Remove a task by Task ID.
View the current task and move to the next task in the circular list.
Display all tasks in the list starting from the head node.
Search for a task by Priority.
Hint:
Use a circular linked list where the last node’s next pointer points back to the first node, creating a circular structure.
Ensure that the list loops when traversed from the head node, so tasks can be revisited in a circular manner.
When deleting or adding tasks, maintain the circular nature by updating the appropriate next pointers.
*/

public class Main {
    public static void main(String[] args) {

    	TaskSchedulerLinkedList scheduler = new TaskSchedulerLinkedList();

        scheduler.addAtEnd(1, "Coding", 1, "2025-01-05");
        scheduler.addAtEnd(2, "Testing", 2, "2025-01-06");
        scheduler.addAtBeginning(3, "Design", 1, "2025-01-04");

        scheduler.display();

        System.out.println("\nRunning Tasks:");
        scheduler.viewNext();
        scheduler.viewNext();
        scheduler.viewNext();
        scheduler.viewNext();

        System.out.println("\nHigh Priority:");
        scheduler.searchByPriority(1);
    }
}

