package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// break-->to stop loop
		//to skip current iteration and move to the next iteration
		
		
		//nested loops-->loop inside a loop
		for (int i =1; i<=3;i++) {
			System.out.println("I am outer loop");
			
			for (int j=1;j<=3;j++) {
				System.out.println("I am inner loop");
			}
		}
	}

}
