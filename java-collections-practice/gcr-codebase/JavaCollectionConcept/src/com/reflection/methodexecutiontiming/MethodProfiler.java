package com.reflection.methodexecutiontiming;

/*12. Method Execution Timing: Use Reflection to measure the execution time of methods in a given class dynamically
*/
import java.lang.reflect.Method;

public class MethodProfiler {

    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();

        Class<?> clazz = service.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("===== Method Execution Timing =====\n");

        for (Method method : methods) {

            // Only profile public methods with no parameters
            if (method.getParameterCount() == 0) {

                long start = System.nanoTime();

                method.invoke(service);

                long end = System.nanoTime();

                long duration = end - start;

                System.out.println("Method: " + method.getName());
                System.out.println("Execution Time: " + duration + " ns");
                System.out.println("--------------------------------");
            }

            // Handle methods with parameters separately
            if (method.getName().equals("compute")) {

                long start = System.nanoTime();

                method.invoke(service, 1_000_000);

                long end = System.nanoTime();

                long duration = end - start;

                System.out.println("Method: " + method.getName());
                System.out.println("Execution Time: " + duration + " ns");
                System.out.println("--------------------------------");
            }
        }
    }
}
