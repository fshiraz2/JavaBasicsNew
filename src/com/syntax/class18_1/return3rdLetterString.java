package com.syntax.class18_1;

public class return3rdLetterString {


	static String surround (String s, String search_term){
		
		return s.replace(search_term, "("+search_term+")");

	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
		System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
	}
}
