package com.reflection.customloggingproxyusingreflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingHandler implements InvocationHandler {

    private final Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {

        // Intercept before execution
        System.out.println("Invoking method: " + method.getName());

        // Call actual method
        Object result = method.invoke(target, args);

        return result;
    }
}
