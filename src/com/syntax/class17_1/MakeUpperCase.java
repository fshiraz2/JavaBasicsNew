package com.syntax.class17_1;

public class MakeUpperCase {
	
	public static String makeCapital(String name)
	{
		return name.toUpperCase();
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(makeCapital("test"));
	}
}