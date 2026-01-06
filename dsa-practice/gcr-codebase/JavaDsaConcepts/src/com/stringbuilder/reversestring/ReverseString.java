package com.stringbuilder.reversestring;

/*Problem 1: Reverse a String Using StringBuilder
Problem:
Write a program that uses StringBuilder to reverse a given string. For example, if the input is "hello", the output should be "olleh".
Approach:
Create a new StringBuilder object.
Append the string to the StringBuilder.
Use the reverse() method of StringBuilder to reverse the string.
Convert the StringBuilder back to a string and return it.
*/

import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		
		String input = "hello";

        StringBuilder sb = new StringBuilder(input);

        sb.reverse();

        String reversed = sb.toString();

        System.out.println("Reversed string: " + reversed);
	}
}
