package com.stringbuilder.removeduplicatesfromstring;

/*Problem 2: Remove Duplicates from a String Using StringBuilder
Problem:
Write a program that uses StringBuilder to remove all duplicate characters from a given string while maintaining the original order.
Approach:
Initialize an empty StringBuilder and a HashSet to keep track of characters.
Iterate over each character in the string:
If the character is not in the HashSet, append it to the StringBuilder and add it to the HashSet.
Return the StringBuilder as a string without duplicates.
*/

import java.util.*;
public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String input = sc.next();
		
		StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (!seen.contains(character)) {
                seen.add(character);
                result.append(character);
            }
        }

        String output = result.toString();

        System.out.println("String without duplicates: " + output);	
	}
}
