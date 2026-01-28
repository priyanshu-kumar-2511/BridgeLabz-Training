package com.reflection.generatejsonrepresentation;

public class User {

    private String name;
    private int age;
    private boolean active;
    private Address address;

    public User(String name, int age,
                boolean active, Address address) {
        this.name = name;
        this.age = age;
        this.active = active;
        this.address = address;
    }
}
