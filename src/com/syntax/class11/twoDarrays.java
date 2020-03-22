package com.syntax.class11;

public class twoDarrays {

	public static void main(String[] args) {
		// get all values from 2D array
		//loop through rows
		String[][] groceries={
		        {"cucumber","potato", "carrot"},
		        {"mango", "apple", "banana", "kiwi"},
		        {"milk", "cheese", "yogurt"}
		        };
				for(String [] a:groceries) {
					for(String b:a) {
						System.out.println(b);
					}
				}
	}
}
	
