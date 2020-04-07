package com.syntax.class21;

public class Dog {

	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";

	
	Dog(String dogName, double dogWeight) {
		this.dogName = dogName;
		this.dogWeight = dogWeight;
		//you do not need to eneter static variable in method
	}

	void display() {
		System.out.println(dogName + " " + dogBreed + " " + dogWeight);
	}
	public static void main(String[] args) {

	    Dog dog1 = new Dog("Tarzan", 50);//only local variables that are not static
	    Dog dog2 = new Dog("Lucy", 10);
	    dog1.display();//static will show in here
	    dog2.display();
}
}
		  
		  