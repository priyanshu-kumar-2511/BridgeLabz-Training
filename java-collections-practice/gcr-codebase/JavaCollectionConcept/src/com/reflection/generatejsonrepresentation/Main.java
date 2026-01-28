package com.reflection.generatejsonrepresentation;

/*9. Generate a JSON Representation: Write a program that converts an object to a JSON-like string using Reflection by inspecting its fields and values.
*/

public class Main {

    public static void main(String[] args) {

        Address address =
                new Address("Delhi", "India");

        User user =
                new User("Ravi", 25, true, address);

        String json = JsonUtil.toJson(user);

        System.out.println(json);
    }
}
