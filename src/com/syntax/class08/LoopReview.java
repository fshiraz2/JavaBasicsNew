package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
/*
 * Ask a user to pay for candy
 * As long as the entered price is not 2
 * we need to keep on asking them to pay
 * One amount is correct--> "Enjoy your candy"
 */
		Scanner s;
		double price;
		
	//	do {
	//	s=new Scanner(System.in);
	//	System.out.println("Please pay for candy");
	//	price=s.nextDouble();
		
	//	}while (Price!=2);
		
	//	System.out.println("Enjoy your candy");
		
		s=new Scanner(System.in);
		System.out.println("Please pay for candy");
		price=s.nextDouble();
		
		while(price!=2) {
		System.out.println("Please pay for candy");
		price=s.nextDouble();
		}
		System.out.println("Enjoy your candy!");
	}

}
