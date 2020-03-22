package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time=10;
		if(time<12) {
			System.out.println("Good Morning");
			
		}
System.out.println("----------WHILE LOOP---------");
		//while(time<12) {
			//System.out.println("Good Morning");//code will execute infinitely
			
while(time<12) {
	System.out.println("Good morning");
	time++;
		}
//how to print numbers from 1 to 50
int num=1;
while (num<=50) {
	System.out.println(num);
	num++;
}
//how to print numbers from 30-30
int num1=20;
while(num1<=30) {
	System.out.println(num1);
	num1++;
}
System.out.println("***********************");
//how to print number from 5-15 all in one line
int num2=5;
while (num2>=15) {
	System.out.println(num2+" ");
}
//how to print values from 10 to 1
int num3=10;
while (num3<=1) {
	System.out.println(num3);
	num3--;
}
//how to print 50 to 1
int num0=50;
while (num0<=1) {
	System.out.println(num0);
	num0--;
}
//how to print odd numbers from 1 to 20
int num5=1;
while(num5<20) {
System.out.println(num5);
num5+=2;
}
//another way is  to use mod and if condition

int num4=1;
while (num4<=20) {
	if (num4%2!=0) {
		System.out.println(num4);
	}
	num4++;
}
// another way
int y=1;
while (y<=20) {
	System.out.println(num4);
	num4++;
}

	}

}
