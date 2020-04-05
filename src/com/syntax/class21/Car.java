package com.syntax.class21;

public class Car {

	 String make;
	  String model;
	  int numberOfDoors;
	  int topSpeed;
	  double price;
	  
	  public Car(String make,String model,int numberOfDoors,int topSpeed,double price){
	    this.make=make;
	    this.model=model;
	    this.numberOfDoors=numberOfDoors;
	    this.topSpeed=topSpeed;
	    this.price=price;
	  }
	    public Car(String make,String model,int topSpeed,double price){
	      numberOfDoors=4;
	    }
	      Car(int numberOfDoors,int topSpeed,double price){
	        make="unknown";
	        model="unknown";
	      }
	        public Car(String make,String model,int numberOfDoors){
	          topSpeed=90;
	          price=0;
	        }
	 
	      public void displayMethod(){
	      System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	      }
	}
