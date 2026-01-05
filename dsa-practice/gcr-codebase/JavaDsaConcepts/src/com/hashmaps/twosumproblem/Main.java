package com.hashmaps.twosumproblem;

/*Two Sum Problem
Problem: Given an array and a target sum, find two indices such that their values add up to the target.
Hint: Use a hash map to store the index of each element as you iterate. Check if target - current_element exists in the map.
*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}
