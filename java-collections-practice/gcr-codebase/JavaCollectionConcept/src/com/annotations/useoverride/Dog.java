package com.annotations.useoverride;

//Child Class
class Dog extends Animal {

@Override
public void makeSound() {
   System.out.println("Dog barks");
}
}