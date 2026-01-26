package com.regex.extractlinksfromwebpage;

/*7️. Extract Links from a Web Page
🔹 Example Text:
"Visit https://www.google.com and http://example.org for more info."
🔹 Expected Output:
https://www.google.com, http://example.org
*/

import java.util.regex.*;

public class LinkExtractor {

    public static void main(String[] args) {

        String text = "Visit https://www.google.com and http://example.org for more info.";

        String regex = "https?://[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(/\\S*)?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Links:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
