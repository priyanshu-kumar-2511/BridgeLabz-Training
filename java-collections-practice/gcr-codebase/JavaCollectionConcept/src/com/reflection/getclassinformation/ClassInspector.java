package com.reflection.getclassinformation;

/*1. Get Class Information: Write a program to accept a class name as input and display its methods, fields, and constructors using Reflection.
*/

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInspector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fully qualified class name: ");
        String className = sc.nextLine();

        try {

            // Load class dynamically
            Class<?> clazz = Class.forName(className);

            System.out.println("\nClass Name: " + clazz.getName());

            // ----- Constructors -----
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();

            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            // ----- Fields -----
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                System.out.println(field);
            }

            // ----- Methods -----
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println(method);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }

        sc.close();
    }
}

