package com.syntax.class25;

public class Animal {
//	Create a class Animal in which define instance variable type,
//	constructor that will initialize instance variables and 2 methods eat and sleep.
//
//	Create a subclass Cat in which override method sleep
//
//	Create 3 Kitten subclasses of a Cat class and override method eat 
//	for 1 kitten - eats milk
//	for 2 kitten - eats snack
//	for 3 kitten - eats everything
//
//	In main method create object of Cat class and all 3 kittens classes and 
//	store into an array of Animals. Call available methods:


		String type;

		public Animal(String type) {
			this.type = type;
		}

		public void eat() {
			System.out.println(type + " eats");
		}

		public void sleep() {
			System.out.println(type + " sleeps");
		}
	}

class Cat extends Animal {

	public Cat(String type) {
		super(type);
	}

	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}

class Kitten1 extends Cat {

	public Kitten1(String type) {
		super(type);

	}

	public void eat() {
		System.out.println(type + " eats milk");
	}

}
class Kitten2 extends Cat {

	public Kitten2(String type) {
		super(type);

	}

	public void eat() {
		System.out.println(type + " eats snacks");
	}
}
class Kitten3 extends Cat {

	public Kitten3(String type) {
		super(type);

	}

	public void eat() {
		System.out.println(type + " eats everything");
	}


	public static void main (String []args) {
//		Cat eats
//		Cat sleeps a lot
//		kitten1 eats milk
//		kitten1 sleeps a lot
//		kitten2 eats snacks
//		kitten2 sleeps a lot
//		kitten3 eats everything
//		kitten3 sleeps a lot
		  Animal[] cats= {new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};
			
			for(Animal c:cats) {
				c.eat();
				c.sleep();
			}
	  }
	}
