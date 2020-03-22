package com.syntax.class12;

import java.util.Scanner;

public class GroupHW {

	public static void main(String[] args) {
	
// * Write a program to swap 2 numbers without a temporary variable?

		{ 
	        int x = 10; 
	        int y = 5; 
	        x = x - y; 
	        System.out.println("x="+x);
	        y = x + y; 
	        
	        System.out.println("y="+y); 
	    } 
	 
		
	// *  Swap  2 strings without a temporary variable?	
	
		    
		        // Declare two strings 
		        String a = "Hello"; 
		        String b = "World"; 
		          
		        // Print String before swapping 
		        System.out.println("Strings before swap: a = " +  
		                                       a + " and b = "+b); 
		          
		        // append 2nd string to 1st 
		        a = a + b; 
		          
		        // store initial string a in string b 
		        b = a.substring(0,a.length()-b.length()); 
		          
		        // store initial string b in string a 
		        a = a.substring(b.length()); 
		          
		        // print String after swapping 
		        System.out.println("Strings after swap: a = " +  
		                                     a + " and b = " + b);  
		        
 //*  Write a java program to check whether a given number is prime or not?
		        int num = 5;
		        boolean num1 = false;
		        for(int b1 = 2; b1 <= num/2;b1++)
		        {
		            // condition for non prime number
		            if(num % b1 == 0)
		            {
		                num1 = true;
		                break;
		            }
		        }

		        if (!num1)
		            System.out.println(num + " is a prime number.");
		        else
		            System.out.println(num + " is not a prime number.");
		    
		
 
 //*  Write a Java Program to print first 10 numbers of Fibonacci series.
  
		        int n = 10, t1 = 0, t2 = 1;
		        System.out.print("First " + n + " terms: ");

		        for (int i = 1; i <= n; ++i)
		        {
		            System.out.print(t1 + " + ");

		            int sum = t1 + t2;
		            t1 = t2;
		            t2 = sum;
		        }
		        
        
 //*  Find out how many alpha characters are present in a String?  
		     
System.out.println("----------------------------");
String s="ABCD12345";
boolean isAlphaNumeric=s!=null && s.chars().allMatch(Character::isLetterOrDigit);
System.out.println("isAlphaNumeric :"+ isAlphaNumeric);
		        
//Find number of words in string?
       
String sentence = "Hello, Welcome to Syntax.";  
int wordCount = 0;  
  
for(int i = 0; i < sentence.length()-1; i++) {  

    if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {  
        wordCount++;  
    }  
}  

wordCount++;  
  

System.out.println("Total number of words in the given string: " + wordCount);  

    
        
 //*  Write a java program to reverse String? 
String original, reverse = "";
Scanner in = new Scanner(System.in);

System.out.println("Enter a string to reverse");
original = in.nextLine();

int length = original.length();

for (int i = length - 1 ; i >= 0 ; i--)
  reverse = reverse + original.charAt(i);

System.out.println("Reverse of the string: " + reverse);

//Reverse a string word by word?


 //*  Write a Java Program to find whether a String is palindrome or not?
 
// *  Write a java program to find the second largest number in the array?
// *   Maximum and minimum number in the array?
 
	

	
	}

}
