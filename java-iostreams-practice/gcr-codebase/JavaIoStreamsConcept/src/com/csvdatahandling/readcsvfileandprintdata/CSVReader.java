package com.csvdatahandling.readcsvfileandprintdata;

/*1️. Read a CSV File and Print Data
Read a CSV file containing student details (ID, Name, Age, Marks).
Print each record in a structured format.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

    	String filePath = "dataincsv/com/csvdatahandling/readcsvfileandprintdata/students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header row
            br.readLine();

            while ((line = br.readLine()) != null) {

                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Remove BOM if present
                line = line.replace("\uFEFF", "");

                String[] data = line.split(",");

                if (data.length != 4) {
                    System.out.println("Skipping malformed row: " + line);
                    continue;
                }

                try {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    double marks = Double.parseDouble(data[3].trim());

                    System.out.println("Student Record:");
                    System.out.println("ID    : " + id);
                    System.out.println("Name  : " + name);
                    System.out.println("Age   : " + age);
                    System.out.println("Marks : " + marks);
                    System.out.println("----------------------");

                } catch (NumberFormatException e) {
                    System.out.println("Invalid numeric value in row: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
