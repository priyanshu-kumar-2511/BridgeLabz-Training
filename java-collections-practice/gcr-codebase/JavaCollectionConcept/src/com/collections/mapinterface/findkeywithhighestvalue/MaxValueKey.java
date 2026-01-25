package com.collections.mapinterface.findkeywithhighestvalue;

/*3. Find the Key with the Highest Value
Given a Map<String, Integer>, find the key with the maximum value.
Example:
Input: {A=10, B=20, C=15} → Output: B.
*/

import java.util.*;

public class MaxValueKey {

    public static String findKeyWithMaxValue(Map<String, Integer> map) {

        if (map == null || map.isEmpty()) {
            return null; // or throw exception
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    // main method 
    public static void main(String[] args) {

        Map<String, Integer> input = new HashMap<>();
        input.put("A", 10);
        input.put("B", 20);
        input.put("C", 15);

        String result = findKeyWithMaxValue(input);

        System.out.println("Key with max value: " + result);
    }
}
