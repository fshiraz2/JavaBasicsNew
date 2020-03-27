package com.syntax.class17_1;

public class SumofEvenMethod {

	public static void main(String[] args) {
		SumofEvenMethod mm=new SumofEvenMethod();
		mm.sumEvenToX(5);
		mm.sumEvenToX(8);
	}
	 void sumEvenToX(int x) {
		 int sum=0;
		for(int i=1;i<=x;i++) {
			if(i%2==0) {
			sum=sum+i;
			}
			
			
		}
	System.out.println(sum);
	}
	
}
