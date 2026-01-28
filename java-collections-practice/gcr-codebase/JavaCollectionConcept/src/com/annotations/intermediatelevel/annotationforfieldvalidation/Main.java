package com.annotations.intermediatelevel.annotationforfieldvalidation;

/*4️. Create a @MaxLength Annotation for Field Validation
✅ Problem Statement:
Define a field-level annotation @MaxLength(int value) that restricts the maximum length of a String field.
🔹 Requirements:
Apply it to a User class field (username).
Validate length in the constructor.
Throw IllegalArgumentException if the limit is exceeded.
*/

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Ravi123");
        System.out.println(user1);

        User user2 = new User("VeryLongUsername123");  // Will fail
        System.out.println(user2);
    }
}
