package com.streams.filehandling;

/*1. File Handling - Read and Write a Text File
📌 Problem Statement:
Write a Java program that reads the contents of a text file and writes it into a new file. If the source file does not exist, display an appropriate message.
Requirements:
Use FileInputStream and FileOutputStream.
Handle IOException properly.
Ensure that the destination file is created if it does not exist.
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {

    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);

            fos = new FileOutputStream(destinationFile);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: Source file does not exist or cannot be read.");

        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}
