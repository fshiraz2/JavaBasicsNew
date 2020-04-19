package com.syntax.class24;

public abstract class AbstractEx {

//	Create a Parent Class that will have two overloaded abstract methods m1
//
//	Make Main class as concrete subclass to Parent Class 
//
//	In main method call the methods. 
//
//	Expected Output:
//	m1 without parameters
//	m1 method with parameter
	
	public abstract void m1();
	
	public abstract void m1(String str);
	
}
class Main extends AbstractEx{
	@Override
	public void m1() {
		System.out.println("m1 without parameters");
	}
	@Override
	public void m1(String str) {
		System.out.println("m1 method with parameters");
	}
	public static void main(String[]args) {
		AbstractEx aa=new Main();
		aa.m1();
		aa.m1("m1 method with parameters");
		
	}
}

