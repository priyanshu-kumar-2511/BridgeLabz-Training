package com.functionalinterface.markerinterfaces.cloningprototypeobjects;

public class Product implements Cloneable {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Override clone() properly
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // shallow copy
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }

    // Optional setters to prove cloning works
    public void setPrice(double price) {
        this.price = price;
    }
}
