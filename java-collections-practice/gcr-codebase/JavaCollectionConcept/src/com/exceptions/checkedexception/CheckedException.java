package com.exceptions.checkedexception;

/*1. Checked Exception (Compile-time Exception)
💡 Problem Statement:
Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.
Expected Behavior:
If the file exists, print its contents.
If the file does not exist, catch the IOException and print "File not found".
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {

        String fileName = "data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
