package com.syntax.class18;

public class Constructor {
	/*//1
	 * Write a program  that will have 4 different access levels of constructors 
	 * and create 3 objects of this class: 1 - inside same class; 2 - from outside the class;
	 *  3 - from different class inside different package and observe result.
	 *  //2
	 * Write program that have static constructor and observe result.
	 */
	
	/*
	 * CE: saying invalid modifier
	 * static Constructor() {
	 * 
	 * }
	 */
	public Constructor(){
		System.out.println("Public constructor");
	}
	
	Constructor(int num){
		System.out.println("Default constructor");
	}
	
	protected Constructor(int num, int num1){
		System.out.println("protected constructor");
	}
	
	private Constructor(String str){
		System.out.println("private constructor");
	}
	
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		Constructor obj1=new Constructor(12);
		Constructor obj2=new Constructor(12,13);
		Constructor obj3=new Constructor("Hi");
	}
}