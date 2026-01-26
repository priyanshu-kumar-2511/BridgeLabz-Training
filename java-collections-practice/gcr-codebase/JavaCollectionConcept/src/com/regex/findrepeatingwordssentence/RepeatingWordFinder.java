package com.regex.findrepeatingwordssentence;


/*1️4️. Find Repeating Words in a Sentence
🔹 Example Input:
"This is is a repeated repeated word test."
🔹 Expected Output:
is, repeated
*/

import java.util.regex.*;
import java.util.*;

public class RepeatingWordFinder {

    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";

        String regex = "\\b(\\w+)\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Repeating Words:");

        Set<String> repeatedWords = new LinkedHashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }

        for (String word : repeatedWords) {
            System.out.println(word);
        }
    }
}

