package com.syntax.class14;

public class Dog {
	String breed;
	String name;
	String color;

	public static void main (String[]args) {
			
			Dog dog1=new Dog();
			
			dog1.breed="Husky";
			dog1.name="";
			dog1.color="";
			dog1.displayDog();
			
				
			Dog dog2=new Dog();
			
			dog2.breed="Bulldog";
			dog2.name="Billy";
			dog2.color="Gray";
			dog2.displayDog();
			
				
			Dog dog3=new Dog();
			
			dog3.breed="Labrador";
			dog3.name="Max";
			dog3.color="Creme";
			dog3.displayDog();
			
			void bark() {
				
				   System.out.println(breed+ " can bark");
					}
					void run() {
						
						System.out.println(breed+ " can run");
					}
					void play () {
						System.out.println(breed+ " can play");
					}
					

				}
}
}
