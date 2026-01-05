package com.stacksandqueues.slidingwindowmax;

import java.util.Arrays;

/*Sliding Window Maximum
Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window.
*/

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] ans = SlidingWindowMax.maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(ans));
    }
}

