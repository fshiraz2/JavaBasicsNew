package com.syntax.class12;

public class StringIsImmutable {
//confusing
	public static void main(String[] args) {
		//immutable=not changeable not modifiable
		String str="Hello";
		String str1="Hello"; //when we add another string hello,
		String str2="World";
		//str.concat(str2);
		//System.out.println(str);//we get Hello
		
		//str=str.concat(str2);
		str=str.toUpperCase();
		
		System.out.println(str);//we get HelloWorld
		
		
		
		
		
	}

}
