package com.inheritance.animalhierarchy;

public class Main {

	public static void main(String[] args) {
		
		 Animal a1 = new Dog("Charlie", 3);
	     Animal a2 = new Cat("Tom", 2);
	     Animal a3 = new Bird("Kiwi", 1);

	     a1.makeSound();   // Dog version
	     a2.makeSound();   // Cat version
	     a3.makeSound();   // Bird version
	}
}
