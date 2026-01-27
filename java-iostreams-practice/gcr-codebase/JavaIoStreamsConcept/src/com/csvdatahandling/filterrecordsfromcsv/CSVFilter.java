package com.csvdatahandling.filterrecordsfromcsv;

/*4️. Filter Records from CSV
Read a CSV file and filter students who have scored more than 80 marks.
Print only the qualifying records.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFilter {

    public static void main(String[] args) {

        String filePath = "dataincsv\\com\\csvdatahandling\\filterrecordsfromcsv\\students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            System.out.println("Students scoring more than 80 marks:\n");

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

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

                    if (marks > 80) {
                        System.out.println("ID: " + id +
                                           ", Name: " + name +
                                           ", Age: " + age +
                                           ", Marks: " + marks);
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid numeric value in row: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
