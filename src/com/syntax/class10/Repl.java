package com.syntax.class10;

import java.util.Scanner;

public class Repl {

	
		  public static void main (String[]args){
			  String [] days=new String[7];
			  Scanner scan=new Scanner (System.in);
			  
			  for (int d=0;d<days.length;d++){
			    System.out.println("Please enter day "+(d+1)+" of the week");
			    days[d]=scan.nextLine();
			  }
			for (int i=0;i<=days.length-1;i++){
			  System.out.println(days[i]);
			}
			 }
			    

			 
			

	}


