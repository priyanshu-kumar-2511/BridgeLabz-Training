package com.hashmaps.findallsubarrayswithzero;

import java.util.*;

/*Find All Subarrays with Zero Sum
Problem: Given an array, find all subarrays whose elements sum up to zero.
Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists.
*/

public class ZeroSumSubarrays {

    static void findZeroSumSubarrays(int[] arr) {

        // prefixSum → list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();

        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            // Case 1: sum from 0 to i is zero
            if (prefixSum == 0) {
                System.out.println("Subarray: [0 , " + i + "]");
            }

            // Case 2: prefix sum seen before
            if (map.containsKey(prefixSum)) {
                for (int startIndex : map.get(prefixSum)) {
                    System.out.println("Subarray: [" + (startIndex + 1) + " , " + i + "]");
                }
            }

            // store current index for this prefixSum
            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

        findZeroSumSubarrays(arr);
    }
}

