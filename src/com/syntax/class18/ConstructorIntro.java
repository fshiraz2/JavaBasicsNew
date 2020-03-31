package com.syntax.class18;

public class ConstructorIntro {
//Constructor-initializes object (initial state of your object by initializing instance variables).
	
//when we don't create any constructor-->compiler will create 1 for us (default constructor) to initialize an Object.
//	ConstructorIntro(){
//	
//	
//}

//to create a constructor: 1. no return type (not even void)
//							2. name must be same as class name
	
ConstructorIntro(){
	System.out.println("I am a constructor");
}

public static void main(String[] args) {
						// = creating an Object and calling a constructor
	ConstructorIntro obj=new ConstructorIntro();
	
	System.out.println("Code after constructor");
	//calling method
	obj.hello();
}

void hello() {
	System.out.println("Hello Class");
}
}
