package com.syntax.class08;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {

		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then 
		//from that range prints the sum of the even and odd integers.
		int num1=0;
		int num2=0;
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your starting number for the range");
		num1=scan.nextInt();
		
		System.out.println("Please enter your ending number for the range");
		num2=scan.nextInt();
		
		int oddSum=0;
		int evenSum=0;
		
		for (int i=num1;i<=num2;i++) {
			if(i%2==0) {
				evenSum=evenSum+i; 
				}else {
				oddSum=oddSum+i;
		}
		

		}
		
		System.out.println("Sum of evens="+evenSum);
		 System.out.println("Sum of odds="+oddSum);
	}

}
