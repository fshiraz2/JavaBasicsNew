package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {
	//try- handles problematic code 
	//catch- handles exception

	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		System.out.println("Catched InterruptedException Exception");//did not catch bc exception did not occure
		}

		System.out.println("Continue to next try block");

		String fPath = "";

		try {
			FileInputStream fis = new FileInputStream(fPath);

		} catch (FileNotFoundException fne) {
			System.out.println("Catched FileNotFoundException Exception");//prints bc does occur
		}

		System.out.println("Continue to next try block");
		
		int a=10;
		int b=0;
		
		try {
			
			System.out.println(a/b);//new ArithmeticException();
			System.out.println("I am code inside try block");//this block will get ignored if exception occurs
		
		}catch (ArithmeticException ae) {
			System.out.println("Cathed ArithmeticException Exception");//prints bc does occur
		}

		System.out.println("End of the program");
	}
}