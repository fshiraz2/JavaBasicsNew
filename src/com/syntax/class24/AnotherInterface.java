package com.syntax.class24;

	class AnotherInterface implements FirstInterface,SecondInterface {
		  
	    public void firstMethod(){
		    System.out.println("First Method implementing multiple Inheritance");
	    }
	    public void secondMethod(){
		    System.out.println("Second Method implementing multiple Inheritance");
	    }
	  
	  public static void main(String[] args) {
	    
	    AnotherInterface mm= new AnotherInterface();
	    mm.firstMethod();
	    mm.secondMethod();
	    
	  }
	}
interface FirstInterface{
	   void firstMethod();
	}
interface SecondInterface  {
	   void secondMethod();
	}