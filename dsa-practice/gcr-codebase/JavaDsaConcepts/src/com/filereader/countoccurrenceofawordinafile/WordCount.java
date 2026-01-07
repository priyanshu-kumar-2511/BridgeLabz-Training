package com.filereader.countoccurrenceofawordinafile;

/*Problem 2: Count the Occurrence of a Word in a File Using FileReader
Problem:
Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
Approach:
Create a FileReader to read from the file and wrap it in a BufferedReader.
Initialize a counter variable to keep track of word occurrences.
For each line in the file, split it into words and check if the target word exists.
Increment the counter each time the word is found.
Print the final count.
*/

import java.io.*;

public class WordCount {

    public static void main(String[] args) {

        String filePath = "data.txt";
        String target = "java";
        int count = 0;

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String w : words) {
                    if (w.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }

            br.close();
            fr.close();

            System.out.println("Word '" + target + "' appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
