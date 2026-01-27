package com.csvdatahandling.sortcsvrecordsbycolumn;

/*7️. Sort CSV Records by a Column
Read a CSV file and sort the records by Salary in descending order.
Print the top 5 highest-paid employees.
*/

import java.io.*;
import java.util.*;

public class CSVSort {

    public static void main(String[] args) {

        String filePath = "dataincsv/com/csvdatahandling/sortcsvrecordsbycolumn/employees.csv";
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                if (data.length != 4) continue;

                try {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    String dept = data[2].trim();
                    double salary = Double.parseDouble(data[3].trim());

                    employees.add(new Employee(id, name, dept, salary));

                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid row: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Sort by salary descending
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));

        System.out.println("Top 5 Highest Paid Employees:\n");

        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println(
                    "ID: " + e.id +
                    ", Name: " + e.name +
                    ", Dept: " + e.department +
                    ", Salary: " + e.salary
            );
        }
    }
}