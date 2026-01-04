package com.stacksandqueues.sortstackusingrecursion;

import java.util.Stack;

/*Sort a Stack Using Recursion
Problem: Given a stack, sort its elements in ascending order using recursion.
Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.
*/

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(3);

        SortStack.sortStack(stack);

        System.out.println(stack);
    }
}
