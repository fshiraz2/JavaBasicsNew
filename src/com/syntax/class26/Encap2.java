package com.syntax.class26;

public class Encap2 {

		  
		 private String empName="John";
		 private int empAge=30;

		 public String getEmpName(){
		 			  return empName;
		 			}
		 			public int getEmpAge(){
		 			  return empAge;
		 			}
					
class Encap2Test {

	 public static void main(String[] args) {

		    Encap2 obj = new Encap2();
		    
		    System.out.println("Employee Name: " + obj.getEmpName());
		    System.out.println("Employee Age: " + obj.getEmpAge());
		  }
		}
}


