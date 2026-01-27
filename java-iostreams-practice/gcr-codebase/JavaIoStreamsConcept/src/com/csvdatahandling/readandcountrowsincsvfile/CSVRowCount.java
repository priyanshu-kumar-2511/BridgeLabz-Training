package com.csvdatahandling.readandcountrowsincsvfile;

/*3️. Read and Count Rows in a CSV File
Read a CSV file and count the number of records (excluding the header row).
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVRowCount {

    public static void main(String[] args) {

        String filePath = "dataincsv/com/csvdatahandling/readandcountrowsincsvfile/employees.csv"; 
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;   // ignore empty lines
                }

                rowCount++;
            }

            System.out.println("Total Records (excluding header): " + rowCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
