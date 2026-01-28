package com.reflection.accessprivatefield;

/*2. Access Private Field: Create a class Person with a private field age. Use Reflection to modify and retrieve its value.
*/
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {

        Person person = new Person(25);

        Class<?> clazz = person.getClass();

        // Get private field
        Field ageField = clazz.getDeclaredField("age");

        // Disable access check
        ageField.setAccessible(true);

        // Read original value
        int originalAge = (int) ageField.get(person);
        System.out.println("Original Age: " + originalAge);

        // Modify value
        ageField.set(person, 40);

        // Read modified value
        int modifiedAge = (int) ageField.get(person);
        System.out.println("Modified Age: " + modifiedAge);

        // Verify via method
        person.display();
    }
}
