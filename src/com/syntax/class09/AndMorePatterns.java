package com.syntax.class09;

public class AndMorePatterns {

	public static void main(String[] args) {
		// make a triangle 
		/*
		 *     *
		 *     **
		 *     ***
		 *     ****
		 */
		
    //rows=4, max columns is 4
	//columns have a dependency on rows
		for (int r=1;r<=4;r++){
			for (int c=1;c<=r;c++) {
				System.out.print("*");
		}
			System.out.println();
		}//print the same thing but with numbers now
		for (int rr=1;rr<=5;rr++){
			for (int cc=1;cc<=rr;cc++) {
				System.out.print(rr);
		}
			System.out.println();
	}
	}
	

}
