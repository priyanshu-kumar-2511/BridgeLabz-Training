package com.streams.bytearray;

/*5. ByteArray Stream - Convert Image to ByteArray
📌 Problem Statement:
Write a Java program that converts an image file into a byte array and then writes it back to another image file.
Requirements:
Use ByteArrayInputStream and ByteArrayOutputStream.
Verify that the new file is identical to the original image.
Handle IOException.
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ImageByteArrayConverter {

    private static final String SOURCE_FILE = "input.jpg";
    private static final String DEST_FILE = "output.jpg";

    public static void main(String[] args) {

        try {
            // Step 1: Read image into byte array using ByteArrayOutputStream
            byte[] imageBytes = convertImageToByteArray(SOURCE_FILE);

            // Step 2: Write byte array back to new image file
            writeByteArrayToImage(imageBytes, DEST_FILE);

            // Step 3: Verify both files are identical
            boolean identical = verifyFiles(SOURCE_FILE, DEST_FILE);

            System.out.println("Files are identical: " + identical);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Convert image file to byte array
    public static byte[] convertImageToByteArray(String filePath) throws IOException {

        try (FileInputStream fis = new FileInputStream(filePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

    // Write byte array to image file using ByteArrayInputStream
    public static void writeByteArrayToImage(byte[] data, String filePath) throws IOException {

        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             FileOutputStream fos = new FileOutputStream(filePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    // Verify two files are identical
    public static boolean verifyFiles(String file1, String file2) throws IOException {

        byte[] original = Files.readAllBytes(Paths.get(file1));
        byte[] copied = Files.readAllBytes(Paths.get(file2));

        return Arrays.equals(original, copied);
    }
}
