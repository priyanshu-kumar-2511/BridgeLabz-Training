package com.streams.convertuppercasetolowercase;

/*6. Filter Streams - Convert Uppercase to Lowercase
📌 Problem Statement:
Create a program that reads a text file and writes its contents into another file, converting all uppercase letters to lowercase.
Requirements:
Use FileReader and FileWriter.
Use BufferedReader and BufferedWriter for efficiency.
Handle character encoding issues.
*/

import java.io.*;

public class UpperToLowerConverter {

    private static final String INPUT_FILE = "input.txt";
    private static final String OUTPUT_FILE = "output.txt";

    public static void main(String[] args) {

        try (
                FileReader fr = new FileReader(INPUT_FILE);
                BufferedReader br = new BufferedReader(fr);

                FileWriter fw = new FileWriter(OUTPUT_FILE);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase
                String lowerCaseLine = line.toLowerCase();

                bw.write(lowerCaseLine);
                bw.newLine();
            }

            System.out.println("Conversion completed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
