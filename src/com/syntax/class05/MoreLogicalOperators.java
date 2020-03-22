package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		/*
		 * We have a total of 7 days a week if day is 2,3--> SDLC if day is 6,7 -->Java
		 * if day 1,5--> Off day if day 4-->Review
		 */

		int day = 6;
		// you can change to OR condition using ||

		// to compare to numbers we use equality operator and equals for strings
		if (day == 2 && day == 3) {
			System.out.println("Today is SDLC class");
		} else if (day == 6 && day == 7) {
			System.out.println("Today is Java class");
		} else if (day == 1 && day == 5) {
			System.out.println("Today there is no class");
		} else if (day == 4) {
			System.out.println("Today is reveiw class with Elion");
		} else {
			System.out.println("Invalid day");
		}
		System.out.println("---------------------------------");
		String day1 = "Saturday";
		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("Today is SDLC Class");
		} else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is JAVA class");
		} else if (day1.equals("Monday") || day1.equals("Friday")) {
			System.out.println("Today there is no class");
		} else if (day1.equals("Thursday")) {
			System.out.println("Today is reveiw class with Elion");
		} else {
			System.out.println("Invalid day");
		}

	}


}
