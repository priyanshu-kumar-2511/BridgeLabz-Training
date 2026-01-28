package com.reflection.dynamicmethodinvocation;

/*5. Dynamic Method Invocation: Define a class MathOperations with multiple public methods (add, subtract, multiply). Use Reflection to dynamically call any method based on user input.
*/

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            MathOperations operations = new MathOperations();

            System.out.print("Enter method name (add/subtract/multiply): ");
            String methodName = scanner.nextLine();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            Class<?> clazz = operations.getClass();

            // Get method dynamically
            Method method = clazz.getMethod(
                    methodName,
                    int.class,
                    int.class
            );

            // Invoke method
            Object result = method.invoke(operations, num1, num2);

            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Invalid method name.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
