package com.stacksandqueues.implementaqueueusingstacks;

import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> stackIn = new Stack<>();
    private Stack<Integer> stackOut = new Stack<>();

    // Enqueue
    public void enqueue(int x) {
        stackIn.push(x);
    }

    // Dequeue
    public int dequeue() {

        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }

        if (stackOut.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stackOut.pop();
    }

    // Peek
    public int peek() {

        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }

        if (stackOut.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stackOut.peek();
    }

    // isEmpty
    public boolean isEmpty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}

