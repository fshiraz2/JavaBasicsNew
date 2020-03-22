package com.syntax.class15;

public class Tasks {
	void larger (int a, int b){
		if (a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}void oddEven(int x){
		if(x%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
	}void palindrome(String word){
		char []array=word.toCharArray();
		String pal="";
		for (int i=array.length-1; i>=0; i--) {
			pal+=array[i];
		}if (pal.equalsIgnoreCase(word)) {
			System.out.println("This is palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
	}
	public static void main (String[]args) {
		Tasks num=new Tasks();
		num.larger(3, 49);
		num.oddEven(89);
		num.palindrome("radio");
	}

}
