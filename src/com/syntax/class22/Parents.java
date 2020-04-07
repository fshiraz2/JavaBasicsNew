package com.syntax.class22;

class Parents {

	  public  Parents(String city){
			  System.out.println(city);
			  }
			public  Parents(){
			      System.out.println("Parent Constructor");
			    }
			  
			}
class Child extends Parents{
	
	Child(String city){
		super(city);
	  }
}
	
class Main{
public static void main (String[]args){
	 Child obj=new Child("Vienna");
	 
	}
}
