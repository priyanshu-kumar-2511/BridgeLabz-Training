package com.csvdatahandling.readlargecsvfile;

/*1️1️. Read Large CSV File Efficiently
Given a large CSV file (500MB+), implement a memory-efficient way to read it in chunks.
Process only 100 lines at a time and display the count of records processed.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVReader {

    private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {

        String filePath = "largefile.csv";
        int totalProcessed = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath), 1024 * 1024)) {
            // 1MB buffer for better performance

            String line;

            // Skip header if present
            br.readLine();

            List<String> batch = new ArrayList<>(CHUNK_SIZE);

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                batch.add(line);

                if (batch.size() == CHUNK_SIZE) {
                    processBatch(batch);
                    totalProcessed += batch.size();
                    batch.clear();   // free memory immediately
                }
            }

            // Process remaining lines
            if (!batch.isEmpty()) {
                processBatch(batch);
                totalProcessed += batch.size();
                batch.clear();
            }

            System.out.println("Total records processed: " + totalProcessed);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void processBatch(List<String> batch) {
        // Simulate processing
        System.out.println("Processing batch of size: " + batch.size());
    }
}
