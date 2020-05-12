package com.syntax.class34;
import java.util.Scanner;
public class Repl1 {
//	Expected Output: 
//		/ by zero
	
	
	  public static void main(String[] args) {
	     int a=10, b=0, result;
	      try {
	        result  = a / b;
	        System.out.println("Result = " + result);
	      }catch (ArithmeticException e) {
	        System.out.println(e.getMessage());
	      }
	  }
	}
