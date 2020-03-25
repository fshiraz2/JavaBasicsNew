package com.syntax.class12;

import java.util.Scanner;

public class PrintEvery3rdLetter {



	  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	  			String words = word.replaceAll(" ", "");
	   
					 
	    for (int j=0;j<words.length();j+=2){

	      System.out.print(words.charAt(j));
	      
	    }
	    
	  }
	  
	}

