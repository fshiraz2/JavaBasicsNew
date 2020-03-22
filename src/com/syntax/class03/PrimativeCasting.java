package com.syntax.class03;

public class PrimativeCasting {
	public static void main(String[] args) {
		
		//widening,happens implicitly
		double d=10;
		System.out.println(d);//10.0
		
		//int i=10.99;-->compile time error:
		//type mismatch, cannot convert double to integer
		
		//narrowing,explicitly implementing
		int i=(int)10.99;
		System.out.println(i);
		
		//byte-128 to 127
		byte b=(byte)1284;// when you want to put something bigger in the smaller box
		System.out.println(b);
		

	}


}
