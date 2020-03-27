package com.syntax.class17_1;

public class IfevenTrue {

	
		public static boolean  bothEven(int num1,int num2)
		{
			if(num1%2==0 && num2%2==0){
			  return true;
			 } else{
			   return  false;
			 }
		}
		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(bothEven(5,6)); //should be false
		}
	}