package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {
	public static void main(String[] args) {
		/*Ask user a gender:M or F
		 * based on teh gender will provide a description
		 */
		Scanner scan;
		char gender;
		String genderType;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter the gender:M or F");
		gender= scan.next().charAt(0);
		
		switch (gender) {
		//with char we need to put in single qoute
		case 'M':
			genderType="Male";
			break;
		case 'F':
			genderType="Female";
		break;
		default:
			genderType="Unknown";
		}
		
		System.out.println("Your gender is "+genderType);

	}
}
