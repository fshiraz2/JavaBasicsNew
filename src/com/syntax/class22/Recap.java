package com.syntax.class22;

public class Recap {
	//INTERVIEW QUESTIONS:
//super()-->calls immediate parent constructor.
//this()-->calls current class constructor.Refers to immediate parent variables and method.
	
//method overloading-->when same method name is exiting multiple times in the same class.You cannot overload if
//you change the access modifier.You can overload method by changing the order of parameters.
//How to implement it? 1)change # of parameters 2)change type of parameters
//Class String:substring(int beginIndex); substring(int beginIndex,int endIndex)
//can we overload main method?yes

//method overriding-->is a feature when SAME method name exits within parent and child class.
//when child class is not satisfied with implementation, one of the parent methods,child class allows to provide 
//it as own logic-->withing child 

	

	public void hello() {
		System.out.println("Hello");
	}

	public void hello(String name) { // --This method is overloaded
		System.out.println("hello " + name);
	}
	
	public void hello(int num) { // --This method is overloaded
		System.out.println("hello " + num);
	}
	
	public void hello1(int num) { // --This method is overloaded
		System.out.println("hello " + num);
	}

	// CE: overloading is not possible by changing access modifier
//	private void hello(String str){
//		System.out.println(str);
//	}

	// CE: overloading is not possible by changing return type
//	public String hello(String name) {
//		return name;
//	}
}
