package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		
		

System.out.println("--PRINTING PATTERN NUMBERS(4x5) USING NESTED LOOPS--");
		for (int f=1;f<5;f++) {
			for (int s=1;s<=5;s++) {
		//if you enter f for the SOP, it will be 11111,22222,33333,etc.
			System.out.print(s);
			}
		System.out.println();
			
			}

System.out.println("--PRINTING 5 rows (1-9)--");
		for (int i=1;i<=5;i++) {
			for (int r=1;r<=9;r++) {
			System.out.print(r);
			}
		System.out.println();
	}
		System.out.println("--PRINTING 5 rows (54321)--");
		for (int g=5;g>=1;g--) {
			for (int h=5;h>=1;h--) {
			System.out.print(h);
			}
		System.out.println();
	}
		System.out.println("--PRINTING 5 rows (11111,22222,33333,etc.)--");
		for (int l=5;l>=1;l--) {
			for (int m=5;m>=1;m--) {
			System.out.print(l);
			}
		System.out.println();
		}
}
}
