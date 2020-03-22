package com.Review04_class11;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		// Use scanner to ask for the size of array
		//Then, read  numbers from the scanner into the array
		//then print whole array
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many elements do you want buddy?");
		int size=scan.nextInt();
		
		//i am creating an array with size =whatever he/she gave us
		int[] nums=new int[size];
		
		//this for loop inserts number into array
		
		for (int i=0;i<size;i++) {
		System.out.println("Give me a number to store in the array!");			
		nums[i]=scan.nextInt();
		
		}
		System.out.println("Let's see what you gave me:");
		//this enhanced loop reads numbers from array
		for (int n:nums) {
			System.out.print(n+" ");
		}
	}

}
