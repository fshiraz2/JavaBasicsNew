package com.syntax.class06;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		// Ask user to enter their country and capture it.
		//Once values are captured print which language user speaks.
		Scanner scan = new Scanner(System.in);
		String country;
		String language = null;
		
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country.toLowerCase()) {
		case "iran":
			language="Farsi";
			break;
		case "egypt":
			language= "Arabic";
			break;
		case "turkey":
			language="Turkish";
			break;
		
		
		}
		System.out.println("If you're from "+country+" I assume you speak "+language);
	
	}


}
