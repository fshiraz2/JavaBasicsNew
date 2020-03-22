package com.syntax.class09;

public class Patterns {
//print 4 rows and 5 columns of stars
//columns are inner and rows are outer
	public static void main(String[] args) {
	for (int a=1;a<=5;a++) {
			System.out.println("*");
		
	}
System.out.println("--PRINTING PATTERN 1 USING NESTED LOOPS--");
	for (int o=1;o<=5;o++) {
		for (int j=1;j<=5;j++) {
		System.out.print("*");
	}
	System.out.println();
	}
	
	System.out.println("--PRINTING PATTERN 2 (10x10) USING NESTED LOOPS--");
	for (int a=1;a<=10;a++) {
		for (int b=1;b<=10;b++) {
		System.out.print("* ");
	}
	System.out.println();
	}
	System.out.println("--PRINTING PATTERN 3 (5x10) USING NESTED LOOPS--");
	for (int c=1;c<=5;c++) {
		for (int d=1;d<=10;d++) {
		System.out.print("* ");
	}
	System.out.println();
	}
	
	}
	
	}

