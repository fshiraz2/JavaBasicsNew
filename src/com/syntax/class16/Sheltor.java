package com.syntax.class16;

public class Sheltor {
	
//ACCESS METHODS FROM DIFFERENT CLASSES:
	
	public static void main(String[]args) {
		//acccess instance variable of diff.class
		Dog puppy=new Dog();
		puppy.name="Charly";
		System.out.println(puppy.name);
		
		//access static variables of diff.class.
		System.out.println(Dog.breed);
	}
}

//in static variable, all objects will be affected!!!!!!!
