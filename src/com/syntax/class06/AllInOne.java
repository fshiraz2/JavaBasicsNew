package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {
	public static void main(String[] args) {
		/*
		 * write a program to ask user if there is a sale
		 * if no sale-->not going shopping
		 * if there is a sale we will ask the price of the item 
		 * based on the price we will apply discount and calculate final price 
		 * 
		 * if price<20 -->apply 10% 
		 * if price is between 20 and 100 -->apply 20% 
		 * if price is between 100 and 500 -->apply 30% 
		 * if price is more than 500-->apply 50%
		 */
		Scanner scan=new Scanner(System.in);
		String sale;
		double price =0;
		double discount=0.0;
		double finalPrice;
		
		System.out.println("Is there a sale?");
		sale=scan.nextLine();
		
		if(sale.equalsIgnoreCase(("Yes"))||sale.equalsIgnoreCase(("yes"))){ 
        System.out.println("What is the price?"); 
        price=scan.nextDouble();
        
	if (price<20) {
		discount=price*0.10;
	}else if (price>=20 && price<=100){
		discount=price*0.20;
	}else if (price>=100 && price<=500) {
		discount=price*0.30;
	}else if (price>500){
		discount=price*0.50;
	}
	finalPrice=(price-discount);
		System.out.println("After discount the price of the item reduced from "+price+ " to "+finalPrice);
	}else {
	   System.out.println("Not going shopping!");
	   
	}

}
	
}
