package com.linkedlist.circularinkedlist.roundrobinschedulingalgorithm;

public class Process {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;

    int waitingTime;
    int turnAroundTime;

    Process next;

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
