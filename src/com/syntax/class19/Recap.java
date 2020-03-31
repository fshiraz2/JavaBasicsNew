package com.syntax.class19;

public class Recap {

	//Constructor types:1)non argument2)parameterized
	//Constructor 1) no return type(not even void)2)name must be same as className
	
		
		Recap() {
			System.out.println("Constructor with no arguments");
		}

		Recap(int num){

			System.out.println("Constructor with 1 Parameter");
		}

		public static void main(String[] args){
//INTERVIEW QUESTION:define the main method?
//  public= access to all, static=non-access modifier, void=return type, main=just name of our method,
//(String[]args)=array in form of string
//in order for code to be executed, you will neeed the main method. It is very important!
			Recap obj=new Recap(2);
			//Recap obj1=new Recap("Hi"); //CE: Constructor is undefined

		}
	}
