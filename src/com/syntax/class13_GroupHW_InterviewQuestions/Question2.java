package com.syntax.class13_GroupHW_InterviewQuestions;

import java.util.Scanner;

public class Question2 {
	//*  Write a java program to check whether a given number is prime or not?
	//should be divisible by 1 and itself only
	//2,3,5,,11,13,etc.....
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("please enter number greater than 1");
		while(true) {//just for the while loop to start
			 num=scan.nextInt();
			if(num>1) {break;
			}System.out.println("Please enter valid number");
		}
		if (num==2) {//2 is the very first prime number 
			System.out.println("This is prime number");
		}else {
			for(int i=2; i<num;i++) {
				if(num%i==0) {System.out.println("This number is not prime");break;
				} if(i==num-1) {//to check if the i is number before the user's number/last i;
					System.out.println("This is a prime number");
				}
			}
		}

	}

}
