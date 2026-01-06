package com.stringbuffer.concatenatestrings;

/*Problem 1: Concatenate Strings Efficiently Using StringBuffer
Problem:
You are given an array of strings. Write a program that uses StringBuffer to concatenate all the strings in the array efficiently.
Approach:
Create a new StringBuffer object.
Iterate through each string in the array and append it to the StringBuffer.
Return the concatenated string after the loop finishes.
Using StringBuffer ensures efficient string concatenation due to its mutable nature.
*/
public class ConcatenateStrings {
	public static void main(String[] args) {
		String[] stringArray = {"I'm", " ", "Priyanshu", " ", "Kumar"};
		
		StringBuffer sb = new StringBuffer();
		
		for(String s : stringArray)
			sb.append(s);
		
		String result = sb.toString();	
	    System.out.println(result);	
	}
}
