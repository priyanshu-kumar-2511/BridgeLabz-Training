package com.collections.listinterface.findfrequencyelements;

/*2. Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.*/

import java.util.*;

public class FrequencyCounter {

    public static Map<String, Integer> findFrequency(List<String> items) {

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {

        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = findFrequency(input);

        System.out.println(result);
    }
}
