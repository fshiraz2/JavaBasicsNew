package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {
	public static void main(String[] args) {
		/*ask user where he/she is from
		 * based on the country we will define favorite food
		 * your favorite food is_________
		 */
Scanner scan;
String country;
String favoriteFood;
scan=new Scanner(System.in);
System.out.println("Please enter your country");
country= scan.nextLine();
//we can convert to lower case by entering the code below.mitooni lower and upper use koni
//switch(country.toLowerCase()) { BUT ALL COUNTRIES HAVE TO BE IN LOWERCASE
switch(country) {
case "Morocco":
	favoriteFood="Potato";
	break;
case "Tajikistan":
favoriteFood="Osh";
break;
case "Turkey":
	favoriteFood="Baklava";
	break;
case "Afghanistan":
	favoriteFood="Mantu";
	break;
case "Kazakhstan":
	favoriteFood="Beshparmak";
	break;
	default:
		favoriteFood= "Unknown";

	
}
System.out.println("Your favorite food is "+favoriteFood);
	}

}
