package com.stacksandqueues.slidingwindowmax;

import java.util.*;

public class SlidingWindowMax {

    public static int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> dq = new LinkedList<>();
        int idx = 0;

        for (int i = 0; i < n; i++) {

            // Remove elements out of this window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Store result when window is formed
            if (i >= k - 1) {
                result[idx++] = arr[dq.peekFirst()];
            }
        }

        return result;
    }
}

