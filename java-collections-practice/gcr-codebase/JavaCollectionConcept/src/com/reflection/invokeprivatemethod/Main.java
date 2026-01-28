package com.reflection.invokeprivatemethod;

/*3. Invoke Private Method: Define a class Calculator with a private method multiply(int a, int b). Use Reflection to invoke this method and display the result.
*/

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();

        Class<?> clazz = calculator.getClass();

        // Get private method
        Method multiplyMethod =
                clazz.getDeclaredMethod("multiply", int.class, int.class);

        // Disable access check
        multiplyMethod.setAccessible(true);

        // Invoke method
        Object result =
                multiplyMethod.invoke(calculator, 5, 7);

        System.out.println("Result: " + result);
    }
}
