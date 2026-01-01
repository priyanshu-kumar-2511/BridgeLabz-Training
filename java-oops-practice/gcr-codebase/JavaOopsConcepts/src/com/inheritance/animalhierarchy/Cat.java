package com.inheritance.animalhierarchy;

public class Cat extends Animal {
	Cat(String name, int age){
		super(name, age);
	}
	
	@Override
	void makeSound() {
		System.out.println(name +" is meow");
	}
}
