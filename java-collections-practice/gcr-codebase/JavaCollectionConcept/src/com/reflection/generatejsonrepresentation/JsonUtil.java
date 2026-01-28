package com.reflection.generatejsonrepresentation;

import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object object) {

        if (object == null)
            return "null";

        Class<?> clazz = object.getClass();

        // Primitive or wrapper or String
        if (clazz == String.class)
            return "\"" + object + "\"";

        if (Number.class.isAssignableFrom(clazz)
                || clazz == boolean.class
                || clazz == Boolean.class)
            return object.toString();

        // Object case
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = clazz.getDeclaredFields();

        boolean first = true;

        for (Field field : fields) {

            field.setAccessible(true);

            try {
                Object value = field.get(object);

                if (!first) {
                    json.append(",");
                }

                json.append("\"")
                    .append(field.getName())
                    .append("\":")
                    .append(toJson(value));   // recursive

                first = false;

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        json.append("}");

        return json.toString();
    }
}
