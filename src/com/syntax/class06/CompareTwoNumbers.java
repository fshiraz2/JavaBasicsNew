package com.syntax.class06;

import java.util.Scanner;

public class CompareTwoNumbers {
	public static void main (String[]args) {
		
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter any three numbers");
		 int num1=input.nextInt();
		 int num2=input.nextInt();
		 int num3=input.nextInt();
		 int largest = 0;
		 
		 if (num1>num2) {
			 if (num1>num3) {
				 largest=num1;
				 
			 }else {
				 largest=num3;
			 }
			 
		 }else {
			 
			 if (num2>num3) {
				 largest=num2;
				 
			 }else {
				 largest=num3;
			 }
		 }
		 System.out.println("Largest number is "+largest);
	}
	
}
