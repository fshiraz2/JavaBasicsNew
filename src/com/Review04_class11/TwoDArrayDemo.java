package com.Review04_class11;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		//1st way of creating 2d-array
	int [][] numbers =new int [2][3];//2 rows 3 columns
	//enter into array.into row index 0 and column index 2
	numbers[0][2]=8;
	numbers[0][0]=5;
	numbers[1][0]=5;
	numbers[0][1]=6;
	numbers[1][1]=2;
	numbers[1][2]=3;
	
	//2nd way of creating 2D array
	int [][] numbers2= {{5,6,8},{9,2,3}};
	System.out.println("Let's get some values from numbers2");
	//first get it, then print it
	int value=numbers2[1][0];//2 rows and 1 column
	System.out.println(value);
	
	//get and print in 1 step
	System.out.println(numbers2[1][1]);
	//1d-array is married to for loop
	//2d-array is married to nested for loop
	
	//how amany rows?
	int rows=numbers2.length;
	//how many columns in 1st row?
	int columns=numbers2[0].length;
	
	for (int row=0;row<numbers2.length;row++) {
		System.out.println(" I am in the "+row+" row");
		//to get all counts in row
		for (int cols=0;cols<numbers2[row].length;cols++){
			System.out.print(" I am in column "+cols);
			System.out.println("; The value is "+numbers2[row][cols]);
		}
		System.out.println();
	}
	}

}
