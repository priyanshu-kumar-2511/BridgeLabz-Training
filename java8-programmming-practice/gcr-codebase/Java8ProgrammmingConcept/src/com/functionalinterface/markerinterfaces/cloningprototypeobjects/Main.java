package com.functionalinterface.markerinterfaces.cloningprototypeobjects;

/*2. Cloning Prototype Objects
○ Scenario: Clone a predefined object model.
○ Task: Use Cloneable marker interface.*/

public class Main {

    public static void main(String[] args) {

        try {
            Product original = new Product("Laptop", 50000);

            // Clone the object
            Product cloned = (Product) original.clone();

            // Modify clone
            cloned.setPrice(45000);

            System.out.println("Original: " + original);
            System.out.println("Cloned  : " + cloned);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
