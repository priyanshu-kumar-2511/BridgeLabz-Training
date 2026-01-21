package com.collections.queueinterface.generatebinarynumbers;

/*2. Generate Binary Numbers Using a Queue
Generate the first N binary numbers (as strings) using a queue.
Example:
N=5 → Output: ["1", "10", "11", "100", "101"].
*/

import java.util.*;

public class GenerateBinaryNumbers {

    public static List<String> generateBinary(int N) {

        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {

            String current = queue.remove();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {

        int N = 5;
        System.out.println(generateBinary(N));
    }
}

