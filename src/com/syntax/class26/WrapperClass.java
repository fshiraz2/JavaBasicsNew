package com.syntax.class26;

public class WrapperClass {

public static void main(String[] args) {
		
		
		int i=10;
		
		//auto boxing-when using primative type as object type
		Integer num=10;//Integer class
		String s=num.toString();
		System.out.println(num.MIN_VALUE);
		
		Byte b=90;
		System.out.println(b.MIN_VALUE);
		System.out.println(b.MAX_VALUE);
		String s1=b.toString();
		System.out.println(s1);
		
		Boolean bool=true;
		//auto unboxing
		boolean b1=bool;//taking out box and putting it back into primitive value
		

	}
}