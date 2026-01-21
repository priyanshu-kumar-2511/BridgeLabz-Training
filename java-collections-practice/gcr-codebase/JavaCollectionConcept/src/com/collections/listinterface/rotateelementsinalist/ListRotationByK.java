package com.collections.listinterface.rotateelementsinalist;

/*3. Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
*/

import java.util.*;

public class ListRotationByK {

    public static void rotateLeft(List<Integer> list, int k) {

        int n = list.size();
        k = k % n; 

        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
        reverse(list, 0, n - 1);
    }

    private static void reverse(List<Integer> list, int start, int end) {

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        rotateLeft(input, 2);
        System.out.println(input);
    }
}
