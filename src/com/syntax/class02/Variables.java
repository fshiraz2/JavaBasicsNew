package com.syntax.class02;

public class Variables {
	public static void main(String[] args) {
		
		String name= "Fargol";
		String lastName= "Shirazi";
		int grade= 10;
		String city = "leesburg";
		String state= "VA";
		//you can use string for phone number as well
		long  phoneNumber= 1234567890l;
		
		city= "Chantilly";
				
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		
		System.out.println("My name is "+name+" and my last name is "+lastName+".");
		System.out.println("I live in the city of "+city+ " in the state "+state+ " and my phone number is "+phoneNumber+".");
	}
}
