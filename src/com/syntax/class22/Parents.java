package com.syntax.class22;

class Parents {

	  public  Parents(String city){
			  System.out.println(city);
			  }
			public  Parents(){
			      System.out.println("Parent Constructor");
			    }
			  
			}
class Childss extends Parents{
	
	Childss(String city){
		super(city);
	  }
}
	
class Mainss{
public static void main (String[]args){
	 Childss obj=new Childss("Vienna");
	 
	}
}
