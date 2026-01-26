package com.regex.extractallcapitalizedwordsfromsentence;

/*5️. Extract All Capitalized Words from a Sentence
🔹 Example Text:
"The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
🔹 Expected Output:
Eiffel, Tower, Paris, Statue, Liberty, New, York
*/

import java.util.regex.*;

public class CapitalizedWordExtractor {

    public static void main(String[] args) {

        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        String regex = "\\b[A-Z][a-z]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Words:");

        while (matcher.find()) {

            String word = matcher.group();

            // Exclude first word of sentence if needed
            if (!word.equals("The")) {
                System.out.println(word);
            }
        }
    }
}
