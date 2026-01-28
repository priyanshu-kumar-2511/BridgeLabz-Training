package com.annotations.beginnerlevel.annotationforpendingtasks;

/*2️. Create a @Todo Annotation for Pending Tasks
✅ Problem Statement:
Define an annotation @Todo to mark pending features in a project.
🔹 Requirements:
The annotation should have fields:
task() (String) → Description of the task
assignedTo() (String) → Developer responsible
priority() (default: "MEDIUM")
Apply it to multiple methods.
Retrieve and print all pending tasks using Reflection.
*/

import java.lang.reflect.Method;

public class TodoProcessor {

    public static void main(String[] args) {

        Class<ProjectModule> clazz = ProjectModule.class;

        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("===== Pending Tasks =====\n");

        for (Method method : methods) {

            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println("Method: " + method.getName());
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("---------------------------");
            }
        }
    }
}
