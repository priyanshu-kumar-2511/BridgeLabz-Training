package com.csvdatahandling.modifycsvfile;

/*6️. Modify a CSV File (Update a Value)
Read a CSV file and increase the salary of employees from the "IT" department by 10%.
Save the updated records back to a new CSV file.
*/

import java.io.*;

public class CSVUpdate {

    public static void main(String[] args) {

        String inputFile = "dataincsv\\com\\csvdatahandling\\modifycsvfile\\employees.csv";
        String outputFile = "dataincsv\\com\\csvdatahandling\\modifycsvfile\\employees_updated.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Read and write header
            line = br.readLine();
            if (line != null) {
                bw.write(line);
                bw.newLine();
            }

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                if (data.length != 4) continue;

                String id = data[0].trim();
                String name = data[1].trim();
                String department = data[2].trim();
                String salaryStr = data[3].trim();

                try {
                    double salary = Double.parseDouble(salaryStr);

                    if (department.equalsIgnoreCase("IT")) {
                        salary = salary + (salary * 0.10);
                    }

                    bw.write(id + "," + name + "," + department + "," + salary);
                    bw.newLine();

                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid row: " + line);
                }
            }

            System.out.println("Updated file created successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

