package com.streams.pipedstreams;

/*8. Piped Streams - Inter-Thread Communication
📌 Problem Statement:
Implement a Java program where one thread writes data into a PipedOutputStream and another thread reads data from a PipedInputStream.
Requirements:
Use two threads for reading and writing.
Synchronize properly to prevent data loss.
Handle IOException.
*/

import java.io.*;

public class PipedStream {

    public static void main(String[] args) {

        try {
            // Create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // Connect them

            // Writer Thread
            Thread writer = new Thread(() -> {
                try (DataOutputStream dos = new DataOutputStream(pos)) {

                    String[] messages = {"Hello","This is inter-thread communication","Using Piped Streams"};

                    for (String msg : messages) {
                        dos.writeUTF(msg);
                        dos.flush();
                        Thread.sleep(500);  // simulate delay
                    }

                } catch (IOException | InterruptedException e) {
                    System.out.println("Writer error: " + e.getMessage());
                }
            });

            // Reader Thread
            Thread reader = new Thread(() -> {
                try (DataInputStream dis = new DataInputStream(pis)) {

                    while (true) {
                        String message = dis.readUTF();
                        System.out.println("Received: " + message);
                    }

                } catch (EOFException e) {
                    System.out.println("Reader finished.");
                } catch (IOException e) {
                    System.out.println("Reader error: " + e.getMessage());
                }
            });

            writer.start();
            reader.start();

            writer.join();
            reader.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Main error: " + e.getMessage());
        }
    }
}

