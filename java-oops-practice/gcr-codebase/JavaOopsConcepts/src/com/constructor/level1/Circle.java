package com.constructor.level1;

public class Circle {
	double radius;

    // Default constructor
    public Circle() {
        this(1.0);   // calls parameterized constructor
    }

    // Parameterized constructor
    public Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius = " + radius);
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();      // default radius
        Circle c2 = new Circle(5.5);   // user-provided radius

        c1.display();
        c2.display();
    }
}
