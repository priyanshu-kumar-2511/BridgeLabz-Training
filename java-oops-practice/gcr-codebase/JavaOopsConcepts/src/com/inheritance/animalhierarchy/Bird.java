package com.inheritance.animalhierarchy;

public class Bird extends Animal {
	Bird(String name, int age){
		super(name, age);
	}
	
	@Override
	void makeSound() {
		System.out.println(name +" is tweet tweet and his age is "+ age);
	}
}
