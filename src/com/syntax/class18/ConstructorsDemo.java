package com.syntax.class18;

public class ConstructorsDemo {
//RULES TO CONSTRUCTOR:
	//1.no return type(not even void)
	//2.name must be same as class name
	
	//TYPES OF CONSTRUCTOR:
	//non argument-(If we do not create any constructor,compilerwill create 1 default non argument constructor).
	//parameterized-constructor can have many and different types of parameters
	
	//CONSTRUCTOR VS.METHOD:
	//1.Constructor can have only class name vs methods can have any name
	//2.Constructor does not return anything,not even void vs.methods can be void or return some value (int,double,char,etc)
	//3.Constructor getting called everytime we create an Object vs.method need to be called.
	//4. Constructor cannot be static, BUT method can be static
	
static String str="Hello";
	
	ConstructorsDemo(){
		System.out.println("I am your contructor");
		System.out.println("I am non argument constructor");
	}
	
	ConstructorsDemo(String str){
		System.out.println("I am a contructor with 1 String parameter "+str);
	}
	
	ConstructorsDemo(int num){
		System.out.println("I am a contructor with 1 integer value="+num);
	}
	
	ConstructorsDemo (String str, int num){
		System.out.println("I am a contructor with 2 parameters:"+str+"&"+num);
	}
	
	void ConstructorsDemo(){//as soon as we add return type --> IT BECOMES method
		System.out.println("I do not know who am I");
	}

	public static void main(String[] args) {
		//ConstructorsDemo obj=new ConstructorsDemo();
		System.out.println(str);
		ConstructorsDemo obj=new ConstructorsDemo("Yes", 13);
		
		ConstructorsDemo obj1=new ConstructorsDemo();
		obj1.ConstructorsDemo();
	}
}
