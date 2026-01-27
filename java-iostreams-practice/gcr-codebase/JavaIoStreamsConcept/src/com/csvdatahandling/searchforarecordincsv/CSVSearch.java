package com.csvdatahandling.searchforarecordincsv;

/*4️. Filter Records from CSV
Read a CSV file and filter students who have scored more than 80 marks.
Print only the qualifying records.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVSearch {

    public static void main(String[] args) {

        String filePath = "dataincsv/com/csvdatahandling/searchforarecordincsv/employees.csv";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name to search: ");
        String searchName = scanner.nextLine().trim();

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                if (data.length != 4) continue;

                String name = data[1].trim();

                if (name.equalsIgnoreCase(searchName)) {

                    String department = data[2].trim();
                    String salary = data[3].trim();

                    System.out.println("\nEmployee Found:");
                    System.out.println("Name       : " + name);
                    System.out.println("Department : " + department);
                    System.out.println("Salary     : " + salary);

                    found = true;
                    break;  // stop after finding
                }
            }

            if (!found) {
                System.out.println("\nEmployee not found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        scanner.close();
    }
}
