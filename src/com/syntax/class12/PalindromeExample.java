package com.syntax.class12;

import java.util.Scanner;

public class PalindromeExample {
	

	
	  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   	//write your code below
	   	
	   	givenString = givenString.replaceAll(" ", "");
	   	String rev="";
	   	
	   		
					int length=givenString.length();
					 
					for(int i=length-1;i>=0;i--) {
					 
						rev=rev+givenString.charAt(i);
					}
					if(givenString.equalsIgnoreCase(rev)) {
						System.out.println("true");
					}else {
						System.out.println("false");
					}
	  
	  }
}
	


