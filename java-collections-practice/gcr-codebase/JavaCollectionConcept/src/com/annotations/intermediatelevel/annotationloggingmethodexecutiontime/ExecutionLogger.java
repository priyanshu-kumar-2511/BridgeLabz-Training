package com.annotations.intermediatelevel.annotationloggingmethodexecutiontime;

/*3️. Create an Annotation for Logging Method Execution Time
✅ Problem Statement:
Define an annotation @LogExecutionTime to measure method execution time.
🔹 Requirements:
Apply @LogExecutionTime to a method.
Use System.nanoTime() before and after execution.
Print execution time.
Apply it on different methods and compare the time taken.
*/

import java.lang.reflect.Method;

public class ExecutionLogger {

    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();
        Method[] methods = TaskService.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();

                method.invoke(service);  // invoke method

                long end = System.nanoTime();

                long duration = end - start;

                System.out.println("Method: " + method.getName());
                System.out.println("Execution Time: " + duration + " ns");
                System.out.println("--------------------------------");
            }
        }
    }
}
