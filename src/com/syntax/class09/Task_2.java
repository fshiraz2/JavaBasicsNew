package com.syntax.class09;

public class Task_2 {

	public static void main(String[] args) {
		// print the pattern on the board
		
		for (int r=1;r<10;r++) {
			for (int c=5;c<=r;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int r=5;r>=1;r--) {
			for (int c=1;c<r;c++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
	}
	

}
