package com.syntax.class19;

public class Animals {//extends to object class by default
//every class has a parent---> which is object class
public String fur, size, color;
	
	public static int age;//she declared a static variable to show how static ones are displayed
	
	public static void display() {//she declared a static method
		
		System.out.println("Animals age is "+age);
	}
	
	public void sleep() {
		System.out.println("All animals sleep");
	}
	
	public void eat() {
		System.out.println("All animals eat");
	}
	
	public void beWild() {
		System.out.println("All animals can be wild");
	}
}
