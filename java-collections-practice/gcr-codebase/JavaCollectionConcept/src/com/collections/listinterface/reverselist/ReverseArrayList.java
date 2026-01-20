package com.collections.listinterface.reverselist;

/*1. Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].
*/
import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        System.out.println(list); 
    }
}
