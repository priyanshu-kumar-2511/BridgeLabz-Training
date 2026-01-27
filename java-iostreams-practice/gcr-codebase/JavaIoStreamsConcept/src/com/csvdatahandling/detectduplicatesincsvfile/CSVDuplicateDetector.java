package com.csvdatahandling.detectduplicatesincsvfile;

/*1️2️. Detect Duplicates in a CSV File
Read a CSV file and detect duplicate entries based on the ID column.
Print all duplicate records.
*/

import java.io.*;
import java.util.*;

public class CSVDuplicateDetector {

    public static void main(String[] args) {

        String filePath = "dataincsv\\com\\csvdatahandling\\detectduplicatesincsvfile\\students.csv";

        Set<String> uniqueIds = new HashSet<>();
        List<String> duplicateRows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                if (data.length < 1) continue;

                String id = data[0].trim();

                if (!uniqueIds.add(id)) {
                    // add() returns false if already exists
                    duplicateRows.add(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        if (duplicateRows.isEmpty()) {
            System.out.println("No duplicate records found.");
        } else {
            System.out.println("Duplicate Records Found:\n");
            for (String row : duplicateRows) {
                System.out.println(row);
            }
        }
    }
}
