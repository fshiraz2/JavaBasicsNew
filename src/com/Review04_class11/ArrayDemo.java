package com.Review04_class11;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//1st professional way
		
		int [] numbers=new int[5];
		System.out.println(numbers[0]);//0
		System.out.println(numbers[3]);//0 bc default value
		
		//initializing values for array elements
		numbers[3]=9;
		numbers[2]=8;
		numbers[1]=7;
		numbers[0]=5;
		numbers[4]=20;
		System.out.println("print elements");
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		int arrayLength=numbers.length;//will tell how many number in array
		System.out.println("The length of the array is: "+arrayLength);
		
		
		//printing the element with index 2(third element)
		System.out.println("printing using index with variable");
		int i=2;//begins from numbers[2]
		System.out.println(numbers[i]);//prints 8 bc numbers[2]
		i++;//increasing i by 1
		System.out.println(numbers[i]);//prints 9 bc increasing to numbers[3]
		
		//method a) using for loop
		//this method can iterate from starting point to some other point(ending)
		System.out.println("Reading from array Using for loop");
		for (int j = 0;j < arrayLength; j++){
			System.out.println(numbers[j]);
		}
		//method b) using for-each loop/advanced for loop/enhanced loop
		//this method iterates the whole array
		System.out.println("Reading from array using for-each loop/advanced for loop-enhanced loop");
			for (int number:numbers) {
			System.out.println(number);
			
		//2nd professional way of initializing array
			System.out.println("Second way using curly brackets");
			int [] num= {4,6,8,9,15};
			System.out.println("Length is :"+num.length);
			
			
			System.out.println("for Loop(even elements) ");
			for (int j=0;j<num.length;j+=2) {
				System.out.println(+num[j]);
			}
			System.out.println("Enhanced for loop");
				for (int number1:num) {
					System.out.println(number1);
					
				}
			}
	}
}

			
		
	


