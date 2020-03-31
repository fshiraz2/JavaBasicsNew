package com.syntax.class18_1;

public class ParenthesisAroundString {


		
		 public static  String surround(String s,String search_term){
		  for(int i=0;i<=s.length();i++){
		   if (s.contains(search_term)){
			  System.out.print(s+("("+search_term+")"));
			  break;
		   }
		  }
		return search_term;
		}
		
		//test case below (don't change):
		public static void main(String[] args){
			System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
			System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
			
		
		}
	}
