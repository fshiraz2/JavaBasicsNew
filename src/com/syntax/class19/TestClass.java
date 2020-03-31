package com.syntax.class19;

public class TestClass {
//every class in java has a parent.by defualt all classes will have a parent class. Even parent classes have obj
//superclass=parent class. the Superclass of Animals is object class.
	public static void main(String[] args) {
		System.out.println("------------Dog Class---------------");
		Dog dog=new Dog();
		//access variables from own class
		dog.breed="Husky";
		//access variables from parent class
		dog.color="Grey";
		dog.fur="Too much";
		dog.size="Big";
		
		//access method from own class
		dog.bark();
		////access methods from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		//access static method :
		Dog.age=2;//define age
		Dog.display();//print from method
		
		System.out.println("------------Animal Class---------------");
		
		Animals animal=new Animals();
		//can access only features define within it is class
		animal.color="Any";
		animal.size="Any";
		animal.fur="Any";
	    //animal.breed=--->you cannot access bc its from child class.
		
		animal.sleep();
		animal.eat();
		animal.beWild();

	}
}
