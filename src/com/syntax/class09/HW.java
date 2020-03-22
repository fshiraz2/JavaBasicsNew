package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		
		
		 //1)Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 // Then print a grade B (use 2 different ways of creating an array).
		char [] grades= new char[6]; 
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		char [] grade= {'A','B','C','D','E','F'};
		System.out.println(grade[1]);
		
		
		
		 // 2)Create an array of names and store all names of your group. 
		 //Then print your name from that array. (use 2 different ways of creating an array).
		
		String names[]=new String[8];
		names[0]="Fargol";
		names[1]="Bayramgul";
		names[2]="Ghulam";
		names[3]="Hichem";
		names[4]="Tina";
		names[5]="Gulnaz";
		names[6]="Vannia";
		names[7]="Kseniia";
		System.out.println(names[0]);
		
	String name[]= {"Fargol","Bayramgul","Ghulam","Hichem", "Tina","Gulnaz","Vannia","Kseniia"};
	System.out.println(name[0]);
		
		
		  
		 //3)Create an array of words: Java, Saturday, day, coding, is.
		// Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 // Collapse
	
	String words[]=new String[5];
	words[0]="Java";
	words[1]="Saturday";
	words[2]="day";
	words[3]="coding";
	words[4]="is";
	System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	}

}
