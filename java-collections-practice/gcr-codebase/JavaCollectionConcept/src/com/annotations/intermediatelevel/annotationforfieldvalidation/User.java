package com.annotations.intermediatelevel.annotationforfieldvalidation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {

        this.username = username;

        validateFields();
    }

    private void validateFields() {

        Field[] fields = this.getClass().getDeclaredFields();

        for (Field field : fields) {

            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength annotation =
                        field.getAnnotation(MaxLength.class);

                field.setAccessible(true);

                try {
                    Object value = field.get(this);

                    if (value instanceof String) {

                        String str = (String) value;

                        if (str.length() > annotation.value()) {
                            throw new IllegalArgumentException(
                                    field.getName() +
                                    " exceeds max length of " +
                                    annotation.value());
                        }
                    }

                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "User{username='" + username + "'}";
    }
}
