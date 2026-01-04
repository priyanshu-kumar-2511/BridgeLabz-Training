package com.linkedlist.circularinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinScheduler {

    Process head = null;
    Process tail = null;
    public int timeQuantum;   // your Main sets this

    int totalProcesses = 0;
    double totalWaiting = 0;
    double totalTurnaround = 0;

    // Add process at end
    public void addProcess(int pid, int burst, int priority) {
        Process newNode = new Process(pid, burst, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        totalProcesses++;
    }

    // Scheduling Process
    public void schedule() {
        if (head == null) return;

        Process current = head;
        Process prev = tail;
        int time = 0;

        while (head != null) {

            int exec = Math.min(current.remainingTime, timeQuantum);
            current.remainingTime -= exec;
            time += exec;

            // increase waiting time of others
            Process temp = head;
            do {
                if (temp != current)
                    temp.waitingTime += exec;
                temp = temp.next;
            } while (temp != head);

            // if process completed → remove it
            if (current.remainingTime == 0) {
                current.turnAroundTime = time;

                totalWaiting += current.waitingTime;
                totalTurnaround += current.turnAroundTime;

                if (current == head && current == tail) {
                    head = tail = null;
                }
                else if (current == head) {
                    head = head.next;
                    tail.next = head;
                }
                else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                }
                else {
                    prev.next = current.next;
                }

                displayQueue();
                current = prev.next;
            }
            else {
                prev = current;
                current = current.next;
                displayQueue();
            }
        }

        System.out.println("\nAverage Waiting Time = " + (totalWaiting / totalProcesses));
        System.out.println("Average Turnaround Time = " + (totalTurnaround / totalProcesses));
    }

    // Display Queue after each round
    private void displayQueue() {
        if (head == null) {
            System.out.println("Queue: Empty");
            return;
        }

        Process temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}


