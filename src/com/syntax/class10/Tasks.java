package com.syntax.class10;

public class Tasks {

	public static void main(String[] args) {
		// 1.Create an array of animals and store 6 elements into it. Using 2 different
		// loops.
		// print all elements from the array

		String[] animals = { "Bear", "Goat", "Monkey", "Lion", "Cat", "Koala" };

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("---Animal Another Way---");
		for (String animal : animals) {
			System.out.println(animal);
		}

		// 2.Create an array of integers and calculate the sum of all integer elements
		// in an array.
		System.out.println("---Adding Integers---");
		int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int integer : integers) {

			sum += integer;
		}
		System.out.println(sum);
		int sum1 = 0;
		for (int i = 0; i < integers.length; i++) {
			sum1 += integers[i];
		}
		System.out.println("The sum of all numbers is " + sum1);

		// 3.Create an array of countries.While retrieving all values from an
		// array print capital for each country.(Use 2 different loops).
		String[] countries = { "Iran", "Azarbaijan", "Iraq", "France", "Lebanon" };
		for (String country : countries) {
			if (country.equals("Iran")) {
				System.out.println("The capital of  " + country + "is " + "Tehran");
			} else if (country.equals("Azarbaijan")) {
				System.out.println("The capital of  " + country + "is " + "Baku");
			} else if (country.equals("Iraq")) {
				System.out.println("The capital of  " + country + "is " + "Baghdad");
			} else if (country.equals("France")) {
				System.out.println("The capital of  " + country + "is " + "Paris");

			} else if (country.equals("Lebanon")) {
				System.out.println("The capital of  " + country + "is " + "Bierut");
			}
			System.out.println("------Another Method------");

			for (int y = 0; y < countries.length; y++) {

				switch (countries[y]) {
				case "Iran":
					System.out.println("The capital of Iran is Tehran");
					break;
				case "Azarbaijan":
					System.out.println("The capital of Azarbaijan is Baku");
					break;
				case "Iraq":
					System.out.println("The capital of Iraq is Baghdad");
					break;
				case "France":
					System.out.println("The capital of France is Paris");
					break;
				case "Lebanon":
					System.out.println("The capital of  Lebanon is Bierut");
					break;
				}
			}
		}
	}
}
