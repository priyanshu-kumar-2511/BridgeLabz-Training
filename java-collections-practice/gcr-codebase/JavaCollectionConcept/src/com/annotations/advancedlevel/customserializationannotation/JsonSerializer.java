package com.annotations.advancedlevel.customserializationannotation;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object object) {

        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder json = new StringBuilder();
        json.append("{");

        boolean first = true;

        for (Field field : fields) {

            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);

                JsonField annotation =
                        field.getAnnotation(JsonField.class);

                try {
                    Object value = field.get(object);

                    if (!first) {
                        json.append(",");
                    }

                    json.append("\"")
                        .append(annotation.name())
                        .append("\":");

                    if (value instanceof String) {
                        json.append("\"")
                            .append(value)
                            .append("\"");
                    } else {
                        json.append(value);
                    }

                    first = false;

                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        json.append("}");

        return json.toString();
    }
}
