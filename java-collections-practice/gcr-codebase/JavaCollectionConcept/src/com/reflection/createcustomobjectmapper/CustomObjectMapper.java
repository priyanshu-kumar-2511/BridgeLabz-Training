package com.reflection.createcustomobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {

    public static <T> T toObject(Class<T> clazz,
                                 Map<String, Object> properties) {

        try {
            // Create instance dynamically
            T instance = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {

                String fieldName = entry.getKey();
                Object value = entry.getValue();

                try {
                    Field field = clazz.getDeclaredField(fieldName);

                    field.setAccessible(true);

                    // Basic type handling
                    if (field.getType() == int.class
                            && value instanceof Number) {

                        field.set(instance,
                                ((Number) value).intValue());

                    } else if (field.getType() == double.class
                            && value instanceof Number) {

                        field.set(instance,
                                ((Number) value).doubleValue());

                    } else {

                        field.set(instance, value);
                    }

                } catch (NoSuchFieldException e) {
                    // Ignore unknown properties
                }
            }

            return instance;

        } catch (Exception e) {
            throw new RuntimeException("Mapping failed", e);
        }
    }
}
