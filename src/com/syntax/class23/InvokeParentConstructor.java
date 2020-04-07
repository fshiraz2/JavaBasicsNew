package com.syntax.class23;

public class InvokeParentConstructor {

	InvokeParentConstructor(){
	    System.out.println("This is Parent constructor");
	  }
	}
class Child extends InvokeParentConstructor{
	   Child(){
	   super();
	  }

	}

class Main {
public static void main (String[]args){
  
  Child chi=new Child();
 
}
}