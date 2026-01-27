package com.csvdatahandling.convertcsvdataintojavaobjects;

/*9️. Convert CSV Data into Java Objects
Read a CSV file and convert each row into a Student Java object.
Store the objects in a List<Student> and print them.
*/

import java.io.*;
import java.util.*;

public class CSVToObject {

    public static void main(String[] args) {

        String filePath = "dataincsv/com/csvdatahandling/convertcsvdataintojavaobjects/students.csv";
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

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

                    Student student = new Student(id, name, age, marks);
                    students.add(student);

                } catch (NumberFormatException e) {
                    System.out.println("Invalid numeric value in row: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Print all students
        System.out.println("Students Loaded:\n");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}