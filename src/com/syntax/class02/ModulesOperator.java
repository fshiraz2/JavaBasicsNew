package com.syntax.class02;

public class ModulesOperator {
	

		public static void main(String[] args) {
			
			float f=12.50f;
			float f1=2.7f;
			
			float result=f/f1;
			
			System.out.println(result);
			
			int i=12;
			int y=7;
			
			int result1=i/y;
			double result2=i/y;
			
			System.out.println(result1);
			System.out.println(result2);
			
			//modules
			int v=16;
			int w=3;
			//we want to see the remainder
			int mod=v%w;
			System.out.println(mod);
			
			//I would like to divide 12/7
			
			//int num1=12.5;not possible to store decimals into integers
			double num2=12;//we can store integers into double
			double num3=7;
			System.out.println(num2);
			System.out.println(num2/num3);
			
			

		}	
}
