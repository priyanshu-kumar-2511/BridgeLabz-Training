package com.reflection.createcustomobjectmapper;

public class User {

    private String name;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age +", email='" + email + "'}";
    }
}
