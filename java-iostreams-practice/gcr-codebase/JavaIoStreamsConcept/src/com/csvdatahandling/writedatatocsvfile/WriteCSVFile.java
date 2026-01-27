package com.csvdatahandling.writedatatocsvfile;

/*2️. Write Data to a CSV File
Create a CSV file with employee details (ID, Name, Department, Salary).
Write at least 5 records to the file.
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {

    public static void main(String[] args) {

        String filePath = "dataincsv/employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            // Write header
            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            // Write records
            bw.write("101,John,IT,60000");
            bw.newLine();

            bw.write("102,Alice,HR,55000");
            bw.newLine();

            bw.write("103,Bob,Finance,70000");
            bw.newLine();

            bw.write("104,Emma,Marketing,65000");
            bw.newLine();

            bw.write("105,David,Sales,50000");
            bw.newLine();

            System.out.println("CSV file created successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
