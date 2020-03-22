package com.syntax.class05;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		// Prompt the user to enter person heights in inches. Person should be
		// classified as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your height");
		
		int inches=scan.nextInt();
		
		if (inches>0 && inches <=60) {
			System.out.println("You have a short height");
		}else if (inches>=61 && inches<=72) {
			System.out.println("You have a medium height");
		}else {
			System.out.println("You have a tall height");
		}
		
		
		
		
	}


}
