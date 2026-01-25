package com.streams.countwordsinfile;

/*10. Count Words in a File
📌 Problem Statement:
Write a Java program that counts the number of words in a given text file and displays the top 5 most frequently occurring words.
Requirements:
Use FileReader and BufferedReader to read the file.
Use a HashMap<String, Integer> to count word occurrences.
Sort the words based on frequency and display the top 5.
*/

import java.io.*;
import java.util.*;

public class CountWordsInAFile {

    private static final String FILE_PATH = "input.txt";

    public static void main(String[] args) {

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase();

                line = line.replaceAll("[^a-z0-9\\s]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.merge(word, 1, Integer::sum);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());

        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Top 5 Most Frequent Words:");

        for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedList.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
