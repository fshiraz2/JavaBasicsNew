package com.syntax.class13_GroupHW_InterviewQuestions;

public class Question2AnotherWay {

	public static void main(String[] args) {
		//*  Write a java program to check whether a given number is prime or not?
		//should be divisible by 1 and itself only
		//2,3,5,,11,13,etc...
		
		int num = 5;//this is the number we check
	    boolean prime =true;//variable to check boolean condition
	    for(int b1 = 2;b1<num;b1++)//2 is 1st prime num,until that num
	    {
	      // condition for non prime number
	      if(num % b1 == 0)//number entered is divisible by nums less than itself
	      {
	        prime = false;
	        break;
	      }
	    }
	    if (prime)//true
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}

}
