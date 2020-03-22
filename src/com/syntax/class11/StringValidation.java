package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		String str1="Welcome Syntax students";
		String str2="Welcome Syntax Students";
		
		//to compare 2 strings
		
		System.out.println("-------equals()equalsIgnoreCase()Function---");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
String expected="Home-Syntax Technologies";
String actual="   Home-Syntax Technologies";
//one way
if(actual.equals(expected)) {
	System.out.println("Test case pass.Titles are matched.");
}else {
	System.out.println("Test case fails.Titles are NOT matched.");
}
if(actual.trim().equals(expected)){
	System.out.println("Test case pass.Titles are matched.");
}else {
	System.out.println("Test case fails.Titles are NOT matched.");
	}
String browser="Chrome";
if(browser.trim().equalsIgnoreCase("chrome")) {
	System.out.println("Test executed on chrome browser");
}
//OR 

if(browser.toLowerCase().contentEquals("chrome")) {
	System.out.println("Test executed on chrome browser");
}
	}
}
