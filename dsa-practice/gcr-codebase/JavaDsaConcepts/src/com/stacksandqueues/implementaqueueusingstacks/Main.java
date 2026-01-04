package com.stacksandqueues.implementaqueueusingstacks;

/*Implement a Queue Using Stacks
Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.
*/

public class Main {
    public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());  // 10
        System.out.println(q.dequeue());  // 20

        q.enqueue(40);

        System.out.println(q.dequeue());  // 30
        System.out.println(q.dequeue());  // 40
    }
}
