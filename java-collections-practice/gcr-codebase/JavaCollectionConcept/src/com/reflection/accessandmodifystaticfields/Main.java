package com.reflection.accessandmodifystaticfields;

/*7. Access and Modify Static Fields: Create a Configuration class with a private static field API_KEY. Use Reflection to modify its value and print it.
*/

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {

        // Load class
        Class<?> clazz = Configuration.class;

        // Get private static field
        Field apiKeyField = clazz.getDeclaredField("API_KEY");

        // Bypass access check
        apiKeyField.setAccessible(true);

        // Read original value (pass null for static field)
        String originalValue = (String) apiKeyField.get(null);
        System.out.println("Original API_KEY: " + originalValue);

        // Modify static field (pass null for static field)
        apiKeyField.set(null, "UPDATED_SECRET_KEY");

        // Read updated value
        String updatedValue = (String) apiKeyField.get(null);
        System.out.println("Updated API_KEY: " + updatedValue);

        // Verify through class method
        Configuration.printKey();
    }
}
