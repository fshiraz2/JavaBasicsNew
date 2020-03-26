package com.syntax.class16;

public  class Dog {

	String name,size;
	//instance variables bc inside class and outside method.
	//Instance variable bc they belong to the instance not to the class. 
	//EVerytime  we create an object of the class(create an instance of the class)
	//every object will get its own copy of the instance variables.
	int age;
	//To access instance variables we need to create an instance of the class(Create an object)
	//any changes we make inside each instance will not affect instance variables of another object
	
	
	//declaring static variables:inside class but outside any method.You use static KEYWORD!
	
	static String breed="Husky";
	static int paws=4;
	static int tail=1;
	static int eyes=2;
	
	
	
	void displayDog() {
		System.out.println("Dog name is "+name+" and it "+size+" dog and age is "+age);
		//display static variable:
		System.out.println("dog's breed is "+breed+" and it has "+paws+" paws and has "+tail+" tail.");
	}
	
	public static void main (String[]args) {
		//objects
		Dog dog1=new Dog();
		//how to access instance variables? by creating an object and using the reference variable
		dog1.name="Lucy";
		dog1.size="Big";
		dog1.age=5;
		dog1.age=6;
		dog1.displayDog();
		
		//how to access static variables?
		//static varibales belong to the class, therefore they can be accessed by className
		System.out.println(Dog.breed);
		
		System.out.println(dog1.breed);//access static variable in static way,
		//but since static variables would rather be avalibale to class
		
		//changing value of static value:
		breed="Bulldog";
		
		Dog dog2=new Dog();
		dog2.name="Sharik";
		dog2.size="Small";
		dog2.age=2;		
		dog2.displayDog();

		Dog dog3=new Dog();
		dog3.name="Pepsi";
		dog3.size="Big";
		dog3.age=10;		
		dog3.displayDog();
	}
}

