package com.syntax.class08;

public class LoopsMoreReview {

	public static void main(String[] args) {
		//to print a number from 50-1
		for (int i=50;i>=1;i--) {
			System.out.println(i);
		}
		
//Print odd numbers between 20 and 50
		for (int i=20;i<=50;i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
		//another way to print odd numbers
		for (int i=21;i<=50;i+=2) {
			System.out.println(i);
		}
		//what is the output
		System.out.println("-----total------");
		int total=2;
		for(int k=1;k<4;k++) {
			total=total*k;
		}
		
		System.out.println(total);
		
	}

}
