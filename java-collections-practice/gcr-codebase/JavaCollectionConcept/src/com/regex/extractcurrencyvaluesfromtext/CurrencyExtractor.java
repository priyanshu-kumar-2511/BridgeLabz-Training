package com.regex.extractcurrencyvaluesfromtext;

/*1️3️. Extract Currency Values from a Text
🔹 Example Text:
"The price is $45.99, and the discount is 10.50."
🔹 Expected Output:
$45.99, 10.50
*/

import java.util.regex.*;

public class CurrencyExtractor {

    public static void main(String[] args) {

        String text = "The price is $45.99, and the discount is 10.50.";

        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Currency Values:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

