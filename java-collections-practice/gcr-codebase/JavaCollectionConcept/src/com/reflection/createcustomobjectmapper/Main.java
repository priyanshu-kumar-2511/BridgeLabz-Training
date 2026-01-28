package com.reflection.createcustomobjectmapper;

/*8. Create a Custom Object Mapper: Implement a method toObject(Class<T> clazz, Map<String, Object> properties) that uses Reflection to set field values from a given Map.
*/

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("name", "Ravi");
        data.put("age", 25);
        data.put("email", "ravi@gamil.com");

        User user = CustomObjectMapper.toObject(User.class, data);

        System.out.println(user);
    }
}
