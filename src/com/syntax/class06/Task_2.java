package com.syntax.class06;

import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		// Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		//At the end your program should print which grade was entered by a user with explanation.
Scanner scan=new Scanner(System.in);

String grade;
String explanation=null;

System.out.println("What is your grade?");
grade=scan.nextLine();

switch (grade.toLowerCase()) {
case "A":
explanation="excellent";
break;

case "B":
explanation="Good";
break;

case "C":
explanation="Average";
break;

case "D":
explanation="Bad";
break;

default:
	grade="Not Acceptable";

}
	System.out.println("Since you got the grade "+grade+" the explanation is "+explanation);

	}


}
