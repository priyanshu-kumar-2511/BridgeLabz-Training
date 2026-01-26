package com.regex.censorbadwordsinsentence;

/*9️. Censor Bad Words in a Sentence
Given a list of bad words, replace them with ****.
🔹 Example Input:
"This is a damn bad example with some stupid words."
🔹 Expected Output:
"This is a **** bad example with some **** words."
*/

import java.util.regex.*;

public class BadWordCensor {

    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";

        String[] badWords = {"damn", "stupid"};

        for (String badWord : badWords) {

            String regex = "\\b" + badWord + "\\b";

            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);

            text = matcher.replaceAll("****");
        }

        System.out.println(text);
    }
}
