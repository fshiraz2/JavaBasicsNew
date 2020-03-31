package com.syntax.class19;

public class Constructors {

	Constructors() {
		this(1);//always must be 1 line inside the constructor
		//this(1,2); CE: this is located on 2 line. you can have one this() for each construct.
		System.out.println("Hi");
	}

	Constructors(int x) {
		this(1, 2);//constructor that accepts 2 int value so it will jump to line 16
		System.out.println("Hello");//will print 2nd
	}

	Constructors(int x, int y) {
		System.out.println("How are you");//will print 1st bc in main method you put #1, 
	}

	public static void main(String[] args) {
		Constructors obj = new Constructors(1);//it will go to line 9 bc accepts 1st int, then  
		//since it says it accepts 2 int, it will jump to line 16 and print that 1st then everything else.
		
		//if your method has this(), it wont print block of code, it will go to another constructor.
	}
}
