package com.hashmaps.longestconsecutivesequence;

import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Only start counting if this is the beginning
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}

