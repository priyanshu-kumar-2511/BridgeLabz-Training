package com.regex.extractprogramminglanguagenamesfromtext;

/*1️2️. Extract Programming Language Names from a Text
🔹 Example Text:
"I love Java, Python, and JavaScript, but I haven't tried Go yet."
🔹 Expected Output:
Java, Python, JavaScript, Go
*/

import java.util.regex.*;
import java.util.*;

public class LanguageExtractor {

    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String[] languages = {"Java", "Python", "JavaScript", "Go"};

        String regex = "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Languages:");

        Set<String> foundLanguages = new LinkedHashSet<>();

        while (matcher.find()) {
            foundLanguages.add(matcher.group());
        }

        for (String lang : foundLanguages) {
            System.out.println(lang);
        }
    }
}

