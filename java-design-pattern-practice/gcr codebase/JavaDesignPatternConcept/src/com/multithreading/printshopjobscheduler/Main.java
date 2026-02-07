package com.multithreading.printshopjobscheduler;

/*Problem 5: Print Shop Job Scheduler
User Scenario:
A print shop has one printer shared among multiple print jobs. The jobs arrive at different times
and have different priorities and sizes.
Requirements:
● Create a PrintJob class using Runnable interface
● Each print job has: job name, number of pages, priority level
● Multiple threads submit print jobs concurrently
● Display job execution details and completion time

Tasks:
1. Create 5 print jobs with different specifications:
○ Job1: 10 pages, Priority 5
○ Job2: 5 pages, Priority 8
○ Job3: 15 pages, Priority 3
○ Job4: 8 pages, Priority 6
○ Job5: 12 pages, Priority 7
2. Set thread priorities based on job priority
3. Simulate printing time (100ms per page)
4. Display: “Printing [JobName] - Page X of Y”
5. Track and display total time taken for all jobs
6. Demonstrate how thread priority affects execution order
Expected Output Pattern:
Starting print jobs...
[High Priority] Printing Job2 - Page 1 of 5
[Medium Priority] Printing Job4 - Page 1 of 8
[Low Priority] Printing Job3 - Page 1 of 15
...
All jobs completed in 5500ms*/

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting print jobs...\n");

        long startTime = System.currentTimeMillis();

        PrintJob j1 = new PrintJob("Job1", 10, 5);
        PrintJob j2 = new PrintJob("Job2", 5, 8);
        PrintJob j3 = new PrintJob("Job3", 15, 3);
        PrintJob j4 = new PrintJob("Job4", 8, 6);
        PrintJob j5 = new PrintJob("Job5", 12, 7);

        Thread t1 = new Thread(j1, "Thread-Job1");
        Thread t2 = new Thread(j2, "Thread-Job2");
        Thread t3 = new Thread(j3, "Thread-Job3");
        Thread t4 = new Thread(j4, "Thread-Job4");
        Thread t5 = new Thread(j5, "Thread-Job5");

        // Set thread priorities
        t1.setPriority(j1.getPriority());
        t2.setPriority(j2.getPriority());
        t3.setPriority(j3.getPriority());
        t4.setPriority(j4.getPriority());
        t5.setPriority(j5.getPriority());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        long endTime = System.currentTimeMillis();

        System.out.println("All jobs completed in " + (endTime - startTime) + " ms");
    }
}
