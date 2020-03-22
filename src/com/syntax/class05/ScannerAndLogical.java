package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {
	public static void main(String[] args) {
		/*You are a salesman
		 * ask a user "How much is sales?"
		 * based on the amount of sales, we need to calculate commision
		 * if sales is between $1-$100-->commission should be 10%
		 * if sales is $100-$200--> the commission should be 20%
		 * if sales is $200-$500--> the commission should be 30%
		 * if sakes is more than $500--> the commission should be %50
		 */
		//1.declare all variables that I will need
		Scanner scan;
		double sales;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		sales=scan.nextDouble();
		
		if (sales>=1 && sales<=100) {
			commission=sales*0.10;
		}else if (sales>100 && sales<=200) {
			commission=sales*0.20;
		}else if (sales>200 && sales<=500) {
			commission=sales*0.30;
		}else {
			commission=sales*0.50;
		}
	
		System.out.println("Based on your sales, your commission is= "+commission);
		{
	if (commission>100) {
		System.out.println("You are an awesome seller");
	
		}
}
}
}
