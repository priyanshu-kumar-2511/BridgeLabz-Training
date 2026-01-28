package com.annotations.advancedlevel.customserializationannotation;

/*6️. Implement a Custom Serialization Annotation @JsonField
✅ Problem Statement:
Define an annotation @JsonField to mark fields for JSON serialization.
🔹 Requirements:
@JsonField(name = "user_name") should map field names to custom JSON keys.
Apply it on a User class.
Write a method to convert object to JSON string by reading the annotations.
*/
public class Main {

    public static void main(String[] args) {

        User user = new User("Ravi", 25, "secret123");

        String json = JsonSerializer.toJson(user);

        System.out.println(json);
    }
}
