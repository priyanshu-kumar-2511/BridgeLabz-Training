package com.inputstreamreader.readuserinputandwritetofile;

/*Problem 2: Read User Input and Write to File Using InputStreamReader
Problem:
Write a program that uses InputStreamReader to read user input from the console and write the input to a file. Each input should be written as a new line in the file.
Approach:
Create an InputStreamReader to read from System.in (the console).
Wrap the InputStreamReader in a BufferedReader for efficient reading.
Create a FileWriter to write to the file.
Read user input using readLine() and write the input to the file.
Repeat the process until the user enters "exit" to stop inputting.
Close the file after the input is finished.
*/

import java.io.*;

public class InputToFile {

    public static void main(String[] args) {

        String filePath = "output.txt";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            FileWriter fw = new FileWriter(filePath, true);

            System.out.println("Type text. Enter 'exit' to stop.");

            String input;

            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input + "\n");
                fw.flush();
            }

            fw.close();
            br.close();
            isr.close();

            System.out.println("Data saved to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
