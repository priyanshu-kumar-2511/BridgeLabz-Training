package com.csvdatahandling.validatecsvdatabeforeprocessing;

/*8️. Validate CSV Data Before Processing
Ensure that the "Email" column follows a valid email format using regex.
Ensure that "Phone Numbers" contain exactly 10 digits.
Print any invalid rows with an error message.
*/

import java.io.*;
import java.util.regex.*;

public class VlidateCSV {

    public static void main(String[] args) {

        String filePath = "dataincsv\\com\\csvdatahandling\\validatecsvdatabeforeprocessing\\employees.csv";

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^\\d{10}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                if (data.length != 4) {
                    System.out.println("Invalid format (wrong column count): " + line);
                    continue;
                }

                String id = data[0].trim();
                String name = data[1].trim();
                String email = data[2].trim();
                String phone = data[3].trim();

                boolean valid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Invalid Email in row: " + line);
                    valid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Invalid Phone Number in row: " + line);
                    valid = false;
                }

				/*
				 * if (valid) { System.out.println("Valid Record: " + line); }
				 */
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
