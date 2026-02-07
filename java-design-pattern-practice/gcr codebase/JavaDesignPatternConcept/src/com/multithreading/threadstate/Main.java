package com.multithreading.threadstate;

/*Problem 4: Thread State Monitoring System
User Scenario:
You need to create a monitoring system that tracks and displays the states of multiple threads
as they execute different tasks.
Requirements:
● Create a TaskRunner class that performs a series of operations
● Create a StateMonitor class that checks and displays thread states
● Demonstrate all thread states: NEW, RUNNABLE, TIMED_WAITING, TERMINATED
Tasks:
1. Create 2 TaskRunner threads that:
○ Sleep for 2 seconds (TIMED_WAITING)
○ Perform some computation (RUNNABLE)
○ Complete execution (TERMINATED)
2. Create a StateMonitor thread that:
○ Checks the state of TaskRunner threads every 500ms
○ Displays: Thread name, current state, timestamp
○ Stops monitoring once all threads are TERMINATED
3. Demonstrate state transitions clearly
4. Use proper exception handling
5. Display summary of state changes observed
Expected Output Pattern:
[Monitor] Task-1 is in NEW state at 10:30:00
[Monitor] Task-1 is in RUNNABLE state at 10:30:01
[Monitor] Task-1 is in TIMED_WAITING state at 10:30:02
[Monitor] Task-1 is in TERMINATED state at 10:30:04
Summary: Task-1 went through 4 states*/

import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        List<Thread> tasks = Arrays.asList(t1, t2);

        // Monitor sees NEW state here
        StateMonitor monitor = new StateMonitor(tasks);

        monitor.start();

        // Small delay to allow monitor to capture NEW
        Thread.sleep(200);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        monitor.join();
    }
}
