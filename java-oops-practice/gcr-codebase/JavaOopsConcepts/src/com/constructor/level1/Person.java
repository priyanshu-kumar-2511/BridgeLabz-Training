package com.constructor.level1;

public class Person {
	String name;
    int age;

    // Normal constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        Person p1 = new Person("Priyanshu", 20);
        Person p2 = new Person(p1);   // cloning p1 into p2

        p1.display();
        p2.display();
    }
}
