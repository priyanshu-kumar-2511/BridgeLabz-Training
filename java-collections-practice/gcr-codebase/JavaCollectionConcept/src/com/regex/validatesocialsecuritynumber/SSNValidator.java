package com.regex.validatesocialsecuritynumber;

/*1️5️. Validate a Social Security Number (SSN)
🔹 Example Input:
"My SSN is 123-45-6789."
🔹 Expected Output:
✅ "123-45-6789" is valid
❌ "123456789" is invalid
*/

import java.util.regex.*;

public class SSNValidator {

    public static boolean isValidSSN(String ssn) {

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return ssn.matches(regex);
    }

    public static void main(String[] args) {

        String text = "My SSN is 123-45-6789.";

        // Extract SSN first
        String extractRegex = "\\d{3}-\\d{2}-\\d{4}";

        Pattern pattern = Pattern.compile(extractRegex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String ssn = matcher.group();

            if (isValidSSN(ssn)) {
                System.out.println("✅ \"" + ssn + "\" is valid");
            } else {
                System.out.println("❌ \"" + ssn + "\" is invalid");
            }
        }
    }
}
