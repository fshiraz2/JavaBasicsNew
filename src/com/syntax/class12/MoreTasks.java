package com.syntax.class12;

import java.util.Scanner;

public class MoreTasks {

	public static void main(String[] args) {
		
		//Task1)create a string and print in reverse order(Sunday-->yadnuS
			String str = "Sunday";
			String rev=";";
			for (int i = str.length()- 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
			}
			System.out.print("Rev string is:");
			System.out.println(rev);
			
			//or you can do it this way​

			
			//Task 2) Create a String and if String is not empty,perform the following:
			//If the String has an odd number of characters, and has 3 more char.,
			//print the char. in the middle of the String.
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a string please: ");
			String text=scan.nextLine();
			
			if (!(text.isEmpty())) {
				if (text.length()%2==1 &&text.length()>=3) {
					System.out.println(text.charAt((text.length())/2));
				}else {
					System.out.println("Even number of characters");
				}
				
			}
		}
	}


