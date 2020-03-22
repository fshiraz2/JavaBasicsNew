package com.syntax.class02;

public class ClassTask {
	public static void main (String[]args) {
		
		//Task 1 in PP
		double num1=12.33;
		double num2=13.22;
		
		double sum=num1+num2;
        double sub=num2-num1;
        double mult=num1*num2;
        double div=num2/num1;
        
        System.out.println("The sum of 2 numbers "+ num1+ " and "+num2+ " is equal to "+sum);
        System.out.println("The subtraction of 2 numbers "+num2+ " and "+num1+ " is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+ " and "+num2+ " is equal to "+mult);
		System.out.println("The division of 2 numbers "+num2+" and "+num1+ " is equal to "+div);
		
		//Task 2 in PP
		double num3= 3.9;
		double sqr= num3*num3;
		
		System.out.println("The square of the " +num3+ " is "+sqr);
			
		//Task 3 in PP
		
		int width=5;
		int height=8;
		int area=width*height;
		int perimeter=2*(width+height);
		
		System.out.println("The perimeter of a rectangle with the width "+width+ " and height "+height+" is equal to "+perimeter+ " and the area is "+area);
		
				
				
	}
}
