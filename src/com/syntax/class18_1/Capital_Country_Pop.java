package com.syntax.class18_1;

public class Capital_Country_Pop {

	String name, capital;
	int population;
	
	//we only need one method not 2, i made a mistake of creating 2 methods
	void displayDetails() {
		System.out.println("The capital of "+name+" is "+capital+" and population is "+population);
	}
	
	public static void main(String[] args) {
		
		Capital_Country_Pop country1=new Capital_Country_Pop();
		country1.name="USA";
		country1.capital="Washington DC";
		country1.population=330000000;
		country1.displayDetails();
		
		Capital_Country_Pop country2=new Capital_Country_Pop();
		country2.name="Kazakhstan";
		country2.capital="Astana";
		country2.population=18500000;
		country2.displayDetails();
	}
}
