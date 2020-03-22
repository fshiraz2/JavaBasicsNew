package com.syntax.class13;
//THIS IS THE CLASS

//define feature of car
public class Car {
String make;
String model;
int year;
String color;
int speed;

//define behavior(define it in form of methods)
//use void and any name
void drive() {
	System.out.println(make+" can drive");
}
void accelerate(){
	System.out.println(make+" can accelerate");
	
}
void makeNoise(){
	System.out.println(make+" makes noise");
}
void stop() {
	System.out.println(make+ " stops when you press break");
	System.out.println("Car Stops");
}
}
