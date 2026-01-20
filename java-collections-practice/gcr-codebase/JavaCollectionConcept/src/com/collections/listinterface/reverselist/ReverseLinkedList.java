package com.collections.listinterface.reverselist;

/*1. Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].
*/
import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        LinkedList<Integer> reversed = new LinkedList<>();

        while (!list.isEmpty()) {
            reversed.add(list.removeLast());
        }

        System.out.println(reversed); 
    }
}
