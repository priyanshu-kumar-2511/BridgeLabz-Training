package com.annotations.advancedlevel.customcachingsystem;

import java.lang.reflect.Method;
import java.util.*;

public class CacheExecutor {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object object,
                                 String methodName,
                                 Object... args) throws Exception {

        Class<?> clazz = object.getClass();

        Method method = findMethod(clazz, methodName, args);

        // If not annotated, just invoke
        if (!method.isAnnotationPresent(CacheResult.class)) {
            return method.invoke(object, args);
        }

        String key = methodName + Arrays.toString(args);

        if (cache.containsKey(key)) {
            System.out.println("Returning cached result...");
            return cache.get(key);
        }

        System.out.println("Computing result...");
        Object result = method.invoke(object, args);
        cache.put(key, result);

        return result;
    }

    // method resolution with primitive support
    private static Method findMethod(Class<?> clazz, String methodName, Object[] args) {

        Method[] methods = clazz.getMethods();

        for (Method method : methods) {

            if (!method.getName().equals(methodName)) continue;

            Class<?>[] paramTypes = method.getParameterTypes();

            if (paramTypes.length != args.length) continue;

            boolean match = true;

            for (int i = 0; i < paramTypes.length; i++) {

                if (!isCompatible(paramTypes[i], args[i].getClass())) {
                    match = false;
                    break;
                }
            }

            if (match) return method;
        }

        throw new RuntimeException("No suitable method found");
    }

    private static boolean isCompatible(Class<?> paramType,
                                        Class<?> argType) {

        if (paramType.isPrimitive()) {
            return (paramType == int.class && argType == Integer.class)
                || (paramType == long.class && argType == Long.class)
                || (paramType == double.class && argType == Double.class)
                || (paramType == float.class && argType == Float.class)
                || (paramType == boolean.class && argType == Boolean.class)
                || (paramType == char.class && argType == Character.class)
                || (paramType == byte.class && argType == Byte.class)
                || (paramType == short.class && argType == Short.class);
        }

        return paramType.isAssignableFrom(argType);
    }
}
