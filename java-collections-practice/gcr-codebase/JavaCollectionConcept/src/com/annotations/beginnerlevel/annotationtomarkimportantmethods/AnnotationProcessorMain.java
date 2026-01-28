package com.annotations.beginnerlevel.annotationtomarkimportantmethods;

/*1️. Create an Annotation to Mark Important Methods
✅ Problem Statement:
Define a custom annotation @ImportantMethod that can be applied to methods to indicate their importance.
🔹 Requirements:
Define @ImportantMethod with an optional level parameter (default: "HIGH").
Apply it to at least two methods.
Retrieve and print annotated methods using Reflection API.
*/

import java.lang.reflect.Method;

public class AnnotationProcessorMain {

    public static void main(String[] args) {

        Class<TaskService> clazz = TaskService.class;

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod annotation =
                        method.getAnnotation(ImportantMethod.class);

                System.out.println("Method: " + method.getName());
                System.out.println("Importance Level: " + annotation.level());
                System.out.println("------------------------");
            }
        }
    }
}
