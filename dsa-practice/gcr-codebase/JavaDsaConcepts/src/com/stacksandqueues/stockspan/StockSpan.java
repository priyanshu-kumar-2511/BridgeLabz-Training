package com.stacksandqueues.stockspan;

import java.util.*;

/*Stock Span Problem
Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
Hint: Use a stack to keep track of indices of prices in descending order.
*/

public class StockSpan {
    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Remove smaller or equal prices
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            // If no greater element on left
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            // Push current index
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        System.out.println(Arrays.toString(span));
    }
}

