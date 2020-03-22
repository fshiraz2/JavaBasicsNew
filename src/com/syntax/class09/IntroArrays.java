package com.syntax.class09;

public class IntroArrays {
	public static void main (String[]args) {
		int num=10;
		//array-big container that stores values of same type. 
		//aray is one of the data structures in JAVA
		//Values inside array called elements
		//elements inside array stored based on index(starts from 0)
		//Arrays are fixed in size.
		
		//declare an array and initialize it, and store values 
		
		int [] array=new int[4];//we are putting 4 elements
		array [0]=10;
		array [1]=20;
		array [2]=30;
		array [3]=40;
		
		//access elements from an array
		System.out.println(array[1]);
		
		//2 ways to write  
		String [] carArray;
		String carArray1[];
		
		//storing elements into array
		carArray=new String[3];
		//array always starts with a 0
		carArray[0]="BMW";
		carArray[1]="Honda";
		carArray[2]="Toyota";
		System.out.println("I am driving "+carArray[2]);
		
		//////////////////////////
		
		int [] numbers= new int [3];
		numbers [0]=100;
		numbers [1]=200;
		numbers[2]=300;
		
		//change value of numbers[1]
		
		numbers[1]=2000;
		System.out.println(numbers[1]+numbers[0]);//2100
		
		
	}
	
}
