package com.syntax.class15;

public class MethodsReturningValue {

	public static void main(String[] args) {
		//create a STring and based on the length of the String 
		//we define whether the String is short or long

			String str="Hello my friend";
			int length=str.length();
			
			if(length>10) {
				System.out.println("String is long");
			}else {
				System.out.println("String is short");
			}
			//compare 2 numbers and then we will identify whether largest number is even or odd
			
			Methods obj=new Methods();
			//int num=obj.isLarger(10,20);CE since isLarger method does not return any value
			MethodsReturningValue newObject=new MethodsReturningValue();
			int num=newObject.largest(12,13);
			boolean flag=newObject.isOdd(num);
			System.out.println("Largest number is "+num+" is odd number : "+flag);//not sure if i wrote this right
	}
	//create a method that returns largest number from 2 given numbers
	//we put int for method bc it returns int value
	int largest(int a, int b) {
		int largest;
		if(a>b) {
	largest=a;
		}else {
			largest=b;
		}
		return largest;
	}
	//we use void when we do not want to return anything
	boolean isOdd(int num) {
		
		boolean isOdd;
		if(num%2==0) {
			isOdd=false;
			
		}else {
			isOdd=true;
		}
		return isOdd;
	}

}
