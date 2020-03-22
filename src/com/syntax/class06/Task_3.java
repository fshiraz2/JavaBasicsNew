package com.syntax.class06;

import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		//Using scanner class create calculator. Allow user to
		//enter 2 numbers and operator(+,-,*,/).
		//Based on operator provide the result to user.
		
		Scanner scan=new Scanner(System.in);
		int num1;
		int num2;
		double total;
		String operator;
		
		System.out.println("Please enter a number");
		num1=scan.nextInt();
		
		System.out.println("Please enter an operator");
		operator=scan.nextLine();
		
		System.out.println("Please enter a number");
		num2=scan.nextInt();
		
		System.out.println();
		
		
	}


}
