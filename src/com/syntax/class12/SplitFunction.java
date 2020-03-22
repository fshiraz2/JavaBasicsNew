package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
	//We can make String in 2 ways
	//String literal--> String str="syntax;
	//using new keyword-->new String("technologies);
	//String objects are immutable=unchangable and unmodifiable
	        
	        System.out.println("----- split() FUNCTION -----");
	        
	        String today="Today is my favorite Java class";
	        
	        String[] array=today.split("my");//splitting point=my=going to cut my
	        System.out.println(array.length);//we can store 2 strings in array
	        
	        System.out.println(array[0]);//Today is
	        System.out.println(array[1]);//favorite java class
	        
	        String today1="Today is my favorite Java class";
	        
	        String[] stringArray=today1.split("a");
	        //print all elements from array 1 by 1
	        //( element type variableName:name of array
	        for(String arr:stringArray) {//arr=variable
	            System.out.print(arr+"|");
	        }
	        System.out.println("----------------------------");
	        //we want to print String word by word
	        String today2="Today is my favorite Java class";
	        String[] words=today2.split(" ");//we need to make array
	        
	        for(int i=0; i<words.length;i++) {
	            
	            System.out.println(words[i]);
	        }
	        System.out.println("------------- TRIM ---------------");
	        
	        String today3="Today is my favorite Java class";
	        today3=today3.trim();
	        System.out.println("String after trimming:"+today3);
	        
	        //today3=today3.split(" ");CE: type mismatch --> split will give you back
	        //array of Strings
	    }
	

	}


