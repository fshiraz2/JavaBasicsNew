package com.syntax.class08;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		//Write a program to ask a user to enter item they want to buy 
		//and the price of that item. Every time user enters money accumulate 
		//the amount and tell the user how much is left to pay off the amount. 
		//If user give more money program should return a change. 
		//Whenever a user done with payments program should say
		//“Thank you for shopping!”
Scanner scan=new Scanner(System.in);
String item;
double priceGiven=0.0;
double amountGiven=0.0;

double total=0.0;





System.out.println("What item do you want to buy?");
item=scan.nextLine();

System.out.println("What is the price of the item?");
priceGiven=scan.nextDouble();

while(priceGiven>0) {
System.out.println("How much did you give?");
amountGiven=scan.nextDouble();

total+=amountGiven;

if(total>priceGiven) {
	double change=total-priceGiven;
	System.out.println("Your change is "+change);
break;
	
}else if  (priceGiven==total) {

	System.out.println("Thank you for Shopping!");
break;

	}
double remainingPrice=priceGiven-total;
System.out.println("You owe us "+remainingPrice);


	

}

	}

	
	}


