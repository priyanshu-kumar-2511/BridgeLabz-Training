package com.filereader.readfilelinebyline;

/*FileReader Problem 1: Read a File Line by Line Using FileReader
Problem:
Write a program that uses FileReader to read a text file line by line and print each line to the console.
Approach:
Create a FileReader object to read from the file.
Wrap the FileReader in a BufferedReader to read lines efficiently.
Use a loop to read each line using the readLine() method and print it to the console.
Close the file after reading all the lines.
*/

import java.io.*;

public class ReadFileUsingFileReader {

    public static void main(String[] args) {

        String filePath = "data.txt";   

        try {
            FileReader fr = new FileReader(filePath);

            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
