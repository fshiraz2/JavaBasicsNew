package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
	String school="Syntax";
	String str=new String("Hello");
	
	String str1="This is a String";
	
	//how many characters string has
	System.out.println("-----Length Function-----");
	System.out.println(school.length());
	
	int size= str.length();
	
	System.out.println("String length is "+size);
	
	//convert String to lower case or upper case
	System.out.println("----Uppercase to Lowercase----");
	System.out.println(school.toUpperCase());
	System.out.println(str.toLowerCase());
     //or
	str=str.toLowerCase();
	System.out.println(str);
	System.out.println("-------Concat Function------");
	//concatinate 2 String
	String newString=str+school;
	System.out.println(newString);
	
	String day="Saturday";
	String date="14";
	//concat is only for string!
	String newDate=day.concat(date);
	System.out.println(newDate);
	
	//concat string has to be on left and right side
	char grade='A';
	String str2="Student";
	//below code will be comp.error,since 
	//concat method is used to attach 1 string to another.
	//str2.concat(grade);
	
	System.out.println("-----isEmpthy Function-----");
	//tells true if there are no char inside of string
	//tells falls  if any char. are inside the String
	String str3="";
	boolean empty=str3.isEmpty();
	System.out.println(empty);
	
	System.out.println("-------trim()Function-----");
	//removes empty/white  space at the beginning and end of String 
	String str4="    Welcome to Syntax!   ";
	
	str4=str4.trim();
	System.out.println("String with no leading or trailing spaces:"+str4);
	
	
	
	
	}

}
