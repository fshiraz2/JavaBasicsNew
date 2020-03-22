package com.syntax.class08;

public class MoreReviewLoops {

	public static void main(String[] args) {
		//write a program to calculate sum of odds and sum of even numbers
		//1-99
		
		
		int oddSum=0;
		int evenSum=0;
		
		  for(int n=1;n<=99;n++) {
			
			if(n%2==0) {
			evenSum=evenSum+n; 
			}else {
			oddSum=oddSum+n;
			
		}

	}
		  System.out.println("Sum of evens="+evenSum);
		  System.out.println("Sum of odds="+oddSum);
		  
		
}
	}

