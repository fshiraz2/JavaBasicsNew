package com.syntax.class05;

import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		// Write a program that will print whether it is a weekend or weekday. If any
		// day from 1-5 → output “It is a weekday”, any day from 6-7 → output “It is a
		// weekend”, any other day → output “Invalid day”
		
		Scanner scan=new Scanner(System.in);
		
	
		
		System.out.println("What number day is it?");
		int day=scan.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("It is a Weekday");
		}else if (day>=6 && day<=7) {
			System.out.println("It is a Weekend");
		}else {
			System.out.println("Invalid day");
		}

	}


}
