package com.stacksandqueues.sortstackusingrecursion;

import java.util.Stack;

public class SortStack {

    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
    }

    private static void insertSorted(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || stack.peek() >= x) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();
        insertSorted(stack, x);
        stack.push(temp);
    }
}
