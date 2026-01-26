package com.annotations.useoverride;

/*Exercise 1: Use @Override Correctly
✅ Problem Statement:
Create a parent class Animal with a method makeSound(). Then, create a Dog class that overrides this method using @Override.
🔹 Steps to Follow:
Define a makeSound() method in Animal class.
Override it in Dog class with @Override.
Instantiate Dog and call makeSound().
*/

//Main Class
public class Main {
     public static void main(String[] args) {

     Animal dog = new Dog();   // Polymorphism

     dog.makeSound();          // Calls overridden method
     }
}
