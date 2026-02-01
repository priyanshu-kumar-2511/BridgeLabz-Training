package com.collectors.wordfrequencycounter;

/*2. Word Frequency Counter
○ Scenario: Analyze a paragraph for word occurrence.
○ Task: Use Collectors.toMap().*/

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String paragraph = "Java is powerful. Java is fast, and Java is scalable!";

        Map<String, Integer> wordFrequency = Arrays.stream(paragraph.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+")                 )
                .collect(Collectors.toMap(word -> word,word -> 1,Integer::sum));

        wordFrequency.forEach((word, count) -> System.out.println(word + " → " + count));
    }
}
