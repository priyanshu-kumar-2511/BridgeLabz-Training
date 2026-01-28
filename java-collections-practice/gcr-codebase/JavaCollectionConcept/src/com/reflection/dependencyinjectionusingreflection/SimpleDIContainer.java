package com.reflection.dependencyinjectionusingreflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SimpleDIContainer {

    private Map<Class<?>, Object> instanceMap = new HashMap<>();

    public <T> T getBean(Class<T> clazz) {

        try {
            // Return existing instance if already created
            if (instanceMap.containsKey(clazz)) {
                return clazz.cast(instanceMap.get(clazz));
            }

            // Create instance
            T instance = clazz.getDeclaredConstructor().newInstance();

            instanceMap.put(clazz, instance);

            // Inject dependencies
            for (Field field : clazz.getDeclaredFields()) {

                if (field.isAnnotationPresent(Inject.class)) {

                    field.setAccessible(true);

                    Class<?> dependencyType = field.getType();

                    Object dependency =
                            getBean(dependencyType);  // recursive

                    field.set(instance, dependency);
                }
            }

            return instance;

        } catch (Exception e) {
            throw new RuntimeException("DI failed", e);
        }
    }
}
