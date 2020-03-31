package com.syntax.class18_1;

public class CallingStaticandNonStaticInMainMethod {


		  public void one(){
		    System.out.println("Programming is amazing");
		    
		  }
		  static void two(){
		    System.out.println("Java is awesome");
		  }
		  public static void main (String[]args){
			  CallingStaticandNonStaticInMainMethod obj=new CallingStaticandNonStaticInMainMethod();
		    obj.one();//caling a non static method in main method
		    
		    two();//calling a static method in main method
		  }
		}
