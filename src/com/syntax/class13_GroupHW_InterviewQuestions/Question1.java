package com.syntax.class13_GroupHW_InterviewQuestions;

public class Question1 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? Swap 2
				
				int x=10;
				int y=5;
				
				x=x+y;//sum of x and y--->x:15
				
				y=x-y;//updated value of y--->15-5=10
				
				x=x-y;//15-new value of y(10)=5;
				
				System.out.println("The value of y is:"+ y);//printing the value of updated y
				
				
				System.out.println("The value of x is:"+x);
				
				// strings without a temporary variable?
				
				String name="Tina";
				String name1="Fargol"; 
				
				name=name.concat(name1);//concatenate them to have both values 
				
				name1=name.replace(name1, "");//we replace not wanted string(name) with space to get name1
	
				
				System.out.println("The value of name1 is:"+ name1);
				name=name.replace(name1, "");
				System.out.println("The value of name is:"+ name);
				
				//This is another way  to do this
				
				String str1="Day";
				String str2="Night";
				
				str1=str1+str2;
				str2=str1.substring(0,3);
				str1=str1.substring(3);
				
				System.out.println("str1="+str1);
				System.out.println("str2="+str2);
				
				// or this way is the best
				String str3="Day";
				String str4="Night";
				
				str3=str3+str4;
				str4=str3.substring(0,str3.length()-str4.length());//Day
				str3=str3.substring(str4.length());//Night
				
				System.out.println("str3="+str3);
				System.out.println("str4="+str4);
			}
		

	}


