package com.syntax.class14;

public class MethodExamples {

	
	//want to create a method that will be greeting a person
		
	//don't have parameters
		void greet() {
		System.out.println("Hello Sarmed");
		}
		//has parameters
		void greet1(String name) {
			System.out.println("Hello "+name);
			}
public static void main (String[]args) {
	//how do i call method greet?--> we need to create an object of the class
	//where that method belongs to
	
	//classNam variableName= new className
	MethodExamples object1=new MethodExamples();
	object1.greet();//hello Sarmed will print
	
	object1.greet1("Sarmed");
	object1.greet1("Faisal");
	object1.greet1("John");
	object1.greet1("Gulen");
	
	object1.greet();
	

	}

}
