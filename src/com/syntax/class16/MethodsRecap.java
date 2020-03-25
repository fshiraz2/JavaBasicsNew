package com.syntax.class16;

public class MethodsRecap {
//create a method that will accept array of integers and return max element from that array
	
	//Method
	int getLargestNumber(int []array) {
	int largest=array[0];
	
	for (int i=1;i<array.length;i++) {
		if (array[i]>largest) {
			largest=array[i];
		}
	}
	return largest;
}
	//create a method that will accept a string and return each word from a given string
	String[] GetWordsFromString(String str) {
		String[] array=str.split(" ");
		//return inside method body
		return array;
	}
	//this is for the above example, not string
	public static void main(String[]args) {
		MethodsRecap obj=new MethodsRecap();
		
		int[] arr= {10,20,38,12};
		System.out.println(obj.getLargestNumber(arr));
		
		//This is for the string example
		String myString="It is a beautiful world";
		String [] words=obj.GetWordsFromString(myString);
		
	for (String word:words) {
		System.out.println(word+" ");
	}
		
	}
}