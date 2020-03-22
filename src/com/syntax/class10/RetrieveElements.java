package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		char[] grades= {'A','B','C','D','E','F'};
		//getting all elements
		for (int i=0;i<grades.length;i++) {
			System.out.println(grades [i]);
		}
		System.out.println("---Printing Using Advanced for Loop---");
		for(char grade:grades) {
			System.out.println(grade);
		}
		//crete an array of fruits and retrieve all elements
		
		String[] fruits= {"Banana","Kiwi","Apple","Mango"};
		//advanced for loop,enhanced for loop,for each loop
		//if fruit is apple-->this is your favorite fruit
		for (String fruit:fruits) {
			if(fruit.equals("Apple")) {
				System.out.println(fruit+" is your favorite fruit.");
			}else {
			System.out.println(fruit);
		}
		
		System.out.println("------------------------------------");
		for (int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
	}
	}
}
