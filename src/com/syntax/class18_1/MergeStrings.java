package com.syntax.class18_1;

public class MergeStrings {

	static String mixString(String s1,String s2) {
		String mixString="";//why do we add this?
		
		for (int i = 0; i < s1.length(); i++) {
			mixString = mixString + s1.charAt(i) + s2.charAt(i);
		}
		return mixString;
	}
	//test case below (dont change):
	public static void main(String[] args){
	 	String firstValue = mixString("12345","abcde"); 
		System.out.println(firstValue); 
		String secondValue = mixString("howdy","hello");
		System.out.println(secondValue); 
	}
}
	
	
	
	
	
	
	
	 
