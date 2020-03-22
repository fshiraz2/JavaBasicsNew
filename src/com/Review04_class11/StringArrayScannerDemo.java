package com.Review04_class11;

import java.util.Scanner;

public class StringArrayScannerDemo {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("How many animals do you have?");
	int length= input.nextInt();
	
	String[] animals=new String[length];//you can use length to see how many bc each time might be a diff #
	
	for (int count=0; count<length; count++) {
		System.out.println("Give me an animal");
		String animal=input.next();		
		animals[count]=animal;//get the animal put into count array
		
	}
	
	System.out.println("=========================");

    for (String str:animals) {//str name of variable
		System.out.println(str);
    }
    System.out.println("=========================");
    System.out.println("print in reverse order");
    for (int i=animals.length-1;i>=0;i--) {//reverse is always length-1
    	String str=animals[i];
    	System.out.println(str);
    }
	}

}
