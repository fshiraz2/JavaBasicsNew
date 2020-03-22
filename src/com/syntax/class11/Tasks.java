package com.syntax.class11;

public class Tasks {

	public static void main(String[] args) {
		/*
		 * Create an array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array using
		 * 2 different loops
		 */
String [][] cars= {
		{"Dodge","Ford","Chevrolet"},
		{"Mercedes-Benz","BMW","Audi"},
		{"Kia", "Hyundai","Renault"}	
};


for (String[] origin:cars) {
	for (String title:origin) {
		System.out.println(title+" ");
	}
}

/* Task2
*Create an array of countries: north america countries,
*south america countries, europe countries,
*asian countries, african countries. 
*Then print all values from that array using
*2 different loops and calculate how many total
*countries been stored.
*/

	String[][] countries= {
			{"Virginia","Texas","Florida"},
			{"Chile","Argentina","Brazil"},
			{"Ukriane","Germany","France"},
			{"Tunisia","Ghana","Kenya"}	
	};	
	int count=0;
	for (String[] country:countries) {
		for (String keshvar:country) {
			System.out.print(keshvar+" ");
			count++;
		}
		System.out.println();
	}
	System.out.println("Total= "+count);
}	
}
