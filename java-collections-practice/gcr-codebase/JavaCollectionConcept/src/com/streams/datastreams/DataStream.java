package com.streams.datastreams;

/*7. Data Streams - Store and Retrieve Primitive Data
📌 Problem Statement:
Write a Java program that stores student details (roll number, name, GPA) in a binary file and retrieves it later.
Requirements:
Use DataOutputStream to write primitive data.
Use DataInputStream to read data.
Ensure proper closing of resources.
*/

import java.io.*;

public class DataStream {

    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {

        // Write student data
        writeStudentData();

        // Read student data
        readStudentData();
    }

    // Writing data using DataOutputStream
    public static void writeStudentData() {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {

            // Student 1
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(8.5);

            // Student 2
            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(9.1);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }

    // Reading data using DataInputStream
    public static void readStudentData() {

        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {

            while (dis.available() > 0) {

                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll: " + rollNumber +", Name: " + name +", GPA: " + gpa);
            }

        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}

