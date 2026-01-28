package com.reflection.dynamicallycreateobjects;

/*4. Dynamically Create Objects: Write a program to create an instance of a Student class dynamically using Reflection without using the new keyword.
*/
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception {

        // Load class dynamically
        Class<?> clazz =
                Class.forName("com.reflection.dynamicallycreateobjects.Student");

        // Get parameterized constructor
        Constructor<?> constructor =
                clazz.getConstructor(String.class, int.class);

        // Create instance (no 'new Student')
        Object student =
                constructor.newInstance("Ravi", 22);

        // Invoke method to verify
        clazz.getMethod("display").invoke(student);
    }
}
