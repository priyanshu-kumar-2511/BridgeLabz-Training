package com.csvdatahandling.mergertwocsvfiles;

/*10. Merge Two CSV Files
You have two CSV files:
students1.csv (contains ID, Name, Age)
students2.csv (contains ID, Marks, Grade)
Merge both files based on ID and create a new file containing all details.
*/

import java.io.*;
import java.util.*;

public class MergeTwoCSVFiles {

    public static void main(String[] args) {

        String file1 = "dataincsv/com/csvdatahandling/mergertwocsvfiles/students1.csv";
        String file2 = "dataincsv/com/csvdatahandling/mergertwocsvfiles/students2.csv";
        String outputFile = "dataincsv/com/csvdatahandling/mergertwocsvfiles/students_merged.csv";

        Map<String, String[]> student2Data = new HashMap<>();

        // Step 1: Load students2.csv into Map
        try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            String line;

            br2.readLine(); // skip header

            while ((line = br2.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                if (data.length == 3) {
                    student2Data.put(data[0].trim(), data);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading students2.csv: " + e.getMessage());
            return;
        }

        // Step 2: Read students1 and merge
        try (
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Write new header
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            br1.readLine(); // skip header

            while ((line = br1.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data1 = line.split(",");

                if (data1.length != 3) continue;

                String id = data1[0].trim();

                if (student2Data.containsKey(id)) {

                    String[] data2 = student2Data.get(id);

                    bw.write(
                        id + "," +
                        data1[1].trim() + "," +
                        data1[2].trim() + "," +
                        data2[1].trim() + "," +
                        data2[2].trim()
                    );

                    bw.newLine();
                }
            }

            System.out.println("Merge completed successfully.");

        } catch (IOException e) {
            System.out.println("Error merging files: " + e.getMessage());
        }
    }
}
