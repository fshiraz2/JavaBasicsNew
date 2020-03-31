package com.syntax.class17;

import com.syntax.class15.Methods;

public class Tasks {
//TASK1
//Create a method that will accept an array as parameters and will return a sum of all elements 
//from that array. Method should be visibly only within same package and accessible by the creating 
//an instance of the class.-->means non-static
	

	protected int sumFromArray(int[] array) {
		int total = 0;
		for(int i =0; i<array.length; i++) {
			total+=array[i];
		}
		return total;
	}

	//TASK2
	//Create a method that will take a String as a parameter and returns reverse String. 
	//Method should be available to all classes within your projects and accessible by class name.--->static String
	    public static String reverse(String str) {
			String reversed="";
			for(int i=str.length()-1; i>=0; i--) {
				reversed += str.charAt(i);
			}
			return reversed;
		}
	    
	  //TASK3
	  //Create a method that will accept a String as a parameter and return a new String that consist only of vowels
	  //Method should be available inside the class where it was declared and executed by calling it is name.
	    private static String getVowels(String str) {
	    	String vowels;
	    	vowels=str.replaceAll("[^aeiouAEIOU]","");
	    	return vowels;
	    }
	    
public static void main (String[]args) {
	
	System.out.println("-----task1----------------");
	
	Tasks obj=new Tasks();
	int [] a= {2,7,1,875};
	System.out.println("total: "+obj.sumFromArray(a));
	
	
	System.out.println("-----task2-----------------");
	
	String str=Tasks.reverse("Hello");
	System.out.println(str);
	System.out.println(reverse("Good"));
	
	
	System.out.println("----task3-----------------");
	
	String vowels=getVowels("Hello");
	System.out.println(vowels);
	
}
	
	}


