package com.streams.bufferedstreams;

/*2. Buffered Streams - Efficient File Copy
📌 Problem Statement:
Create a Java program that copies a large file (e.g., 100MB) from one location to another using Buffered Streams (BufferedInputStream and BufferedOutputStream). Compare the performance with normal file streams.
Requirements:
Read and write in chunks of 4 KB (4096 bytes).
Use System.nanoTime() to measure execution time.
Compare execution time with unbuffered streams.
*/

import java.io.*;

public class BufferedVsUnbufferedCopy {

    private static final int BUFFER_SIZE = 4096; 

    public static void main(String[] args) {

        String sourceFile = "largefile.dat";   
        String unbufferedDest = "copy_unbuffered.dat";
        String bufferedDest = "copy_buffered.dat";

        copyUsingUnbufferedStreams(sourceFile, unbufferedDest);
        copyUsingBufferedStreams(sourceFile, bufferedDest);
    }

    private static void copyUsingUnbufferedStreams(String src, String dest) {

        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error during unbuffered copy.");
            return;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Unbuffered Copy Time: " + duration / 1_000_000 + " ms");
    }

    private static void copyUsingBufferedStreams(String src, String dest) {

        long startTime = System.nanoTime();

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error during buffered copy.");
            return;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Buffered Copy Time: " + duration / 1_000_000 + " ms");
    }
}
