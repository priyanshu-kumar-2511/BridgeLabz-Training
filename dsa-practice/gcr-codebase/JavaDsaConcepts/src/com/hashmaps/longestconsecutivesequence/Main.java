package com.hashmaps.longestconsecutivesequence;

/*Longest Consecutive Sequence
Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
Hint: Use a hash map to store elements and check for consecutive elements efficiently.*/

public class Main {
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int result = LongestConsecutiveSequence.longestConsecutive(arr);

        System.out.println(result);
    }
}
