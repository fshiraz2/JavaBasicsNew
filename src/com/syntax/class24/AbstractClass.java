package com.syntax.class24;
//Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
//
//Make Main class to be a derived class from Parent.
//
//In main method execute both methods
//
//Expected Output: 
//Child class providing implementation
//Parent class providing implementation
abstract class AbstractClass{
	  abstract void m1();
	  void m2(){
	    System.out.println("Parent class providing implementation");
	  }
	}
class Mainz extends AbstractClass {
	  void m1(){
	    System.out.println("Child class providing implementation");
	  }
	   
	  public static void main(String[] args) {
	    AbstractClass pp=new Mainz();
	    pp.m1();
	    pp.m2();
	  }
	}