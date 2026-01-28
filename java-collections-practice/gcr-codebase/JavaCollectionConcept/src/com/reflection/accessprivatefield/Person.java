package com.reflection.accessprivatefield;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Age: " + age);
    }
}
