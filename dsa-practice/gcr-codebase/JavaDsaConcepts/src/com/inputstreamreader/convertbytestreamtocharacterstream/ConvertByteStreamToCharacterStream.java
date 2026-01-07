package com.inputstreamreader.convertbytestreamtocharacterstream;

/*Problem 1: Convert Byte Stream to Character Stream Using InputStreamReader
Problem:
Write a program that uses InputStreamReader to read binary data from a file and print it as characters. The file contains data encoded in a specific charset (e.g., UTF-8).
Approach:
Create a FileInputStream object to read the binary data from the file.
Wrap the FileInputStream in an InputStreamReader to convert the byte stream into a character stream.
Use a BufferedReader to read characters efficiently from the InputStreamReader.
Read the file line by line and print the characters to the console.
Handle any encoding exceptions as needed.
*/

import java.io.*;

public class ConvertByteStreamToCharacterStream {

    public static void main(String[] args) {

        String filePath = "data.txt";

        try {
            FileInputStream fis = new FileInputStream(filePath);

            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            isr.close();
            fis.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}