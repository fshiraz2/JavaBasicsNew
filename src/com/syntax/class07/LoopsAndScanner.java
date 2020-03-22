package com.syntax.class07;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
		// we want to ask user's name and print Good Afternon____;
		//we want to ask user's name 5x and good afternoon 5x
		Scanner input;
		String name=null;
		int num = 0;
		input=new Scanner(System.in);
		
		while(num<=5) {
		System.out.println("What is your name");
		name=input.nextLine();
		
		System.out.println("Good Afternoon "+name);
		num++;
		}	

		
		
	}

}
