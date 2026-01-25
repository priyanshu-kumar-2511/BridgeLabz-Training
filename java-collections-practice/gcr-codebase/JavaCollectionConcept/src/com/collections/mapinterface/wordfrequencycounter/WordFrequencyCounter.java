package com.collections.mapinterface.wordfrequencycounter;

/*1. Word Frequency Counter
Read a text file and count the frequency of each word using a HashMap. Ignore case and punctuation.
Example:
Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}
*/

import java.util.*;

public class WordFrequencyCounter {
	public static Map<String, Integer> countWords(String input){
		Map<String, Integer> frequencyMap = new HashMap<>();
		
		input = input.toLowerCase();
		input = input.replaceAll("[^a-z0-9\\s]", "");
		
		String[] words = input.split("\\s+");
		
		for(String word : words) {
			if(!word.isEmpty()) {
				frequencyMap.put(word,  frequencyMap.getOrDefault(word, 0)+1);
			}
		}
		return frequencyMap;
	}
	
	 public static void main(String[] args) {

	        String text = "Hello Priyanshu, hello Java!";
	        Map<String, Integer> result = countWords(text);

	        System.out.println(result);
	    }
}
