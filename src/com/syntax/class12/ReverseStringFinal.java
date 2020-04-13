package com.syntax.class12;

public class ReverseStringFinal { 
		 public final String reverseString(String toReverse){
			    
			    String reverseString="";
			    for(int i=toReverse.length()-1;i>=0;i--){
			      reverseString=reverseString+toReverse.charAt(i);
			    }
			    
			    return reverseString;
		  }
		}
class Main {

	  public static void main(String[] args){
	    
	    Main mm=new Main();
	    String newString=mm.reverseString("hello");
	    System.out.println(newString);
	  }
}