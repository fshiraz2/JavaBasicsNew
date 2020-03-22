package com.syntax.class03;

public class CompareNumbers {

	
		public static void main(String[] args) {
			double numberOne=10;
			double numberTwo=10;
			if(numberOne>numberTwo) {
				System.out.println("Number one is larger than number 2");
			}else {
				System.out.println("Numbers are equal");
			}

			System.out.println("--------------------------");
			//declare variable for a day then based on the value, we will provide
			//output
			
			int day=6;
			
			if (day==1) {
				System.out.println("it is Monday. No class Today.");
			}else if (day==2) {
				System.out.println("It is Tuesday. We have SDLC Class.");
			}else if (day==3) {
				System.out.println("It is Wednesday. We have SDLC Class.");
			}else if (day==4) {
				System.out.println("It's Thursday. We have Review Class.");
			}else if (day==5){
				System.out.println("It's Friday. No Class!");
			}else if (day==6){
				System.out.println("It's Saturday. We have Java Class.");
			}else if (day==7) {
				System.out.println("It's Sunday. We have Java Class");
						
			}
			
		}

	

	}


