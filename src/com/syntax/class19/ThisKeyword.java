package com.syntax.class19;

public class ThisKeyword {

	int a,b;

	public ThisKeyword() {
		System.out.println("*I am non argument constructor*");
	}
	
	public ThisKeyword(int a, int b) {
		this.a=a;//this.a=100;
		this.b=b;
	}
	
	public void sum(int a, int b) {
		//sum of which variables am I calculating?
		System.out.println("Sum of local variables "+(a+b));
		System.out.println("Sum of instance variables "+(this.a+this.b));
	}
	
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(10, 20);//instance will print bc ThisKeyword method is in it(line 8).
		obj.sum(100, 200);//local will print bc calling the sum method in line 16
		
		System.out.println("------------------------------------------");
		ThisKeyword obj2=new ThisKeyword();//0 for instance bc you have not assigned variable
		obj2.sum(20, 40);//will print 60 for local variable 
	}
}