package com.syntax.class09;

public class Task_1 {

	public static void main(String[] args) {
		// print a triangle from 5 to 1 (555555,4444,333,22,1)
		
		for (int r=5;r>=1;r--) {
			for (int c=1;c<=r;c++) {
				System.out.print(r);
			}
			System.out.println();
		}

	}

}
