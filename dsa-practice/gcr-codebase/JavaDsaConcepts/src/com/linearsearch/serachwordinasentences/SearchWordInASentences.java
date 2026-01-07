package com.linearsearch.serachwordinasentences;

/*Problem 2: Search for a Specific Word in a List of Sentences
Problem:
You are given an array of sentences (strings). Write a program that performs Linear Search to find the first sentence containing a specific word. If the word is found, return the sentence. If no sentence contains the word, return "Not Found".
Approach:
Iterate through the list of sentences.
For each sentence, check if it contains the specific word.
If the word is found, return the current sentence.
If no sentence contains the word, return "Not Found".
*/

public class SearchWordInASentences {
    public static String findSentence(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] data = {"Java is a powerful language", "I love programming", "Data structures are important", "Machine learning is the future"};
        String result = findSentence(data, "data");

        System.out.println(result);
    }
}
