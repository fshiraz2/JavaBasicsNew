package com.syntax.class22;

public class CarObjects {
		  
	class CarObjects{
		  
		  String model; 
		  double price; 
		  double quantity; 
		  
		  public CarObjects(String model, double price, double quantity){
		    this.model = model; 
		    this.price = price; 
		    this.quantity = quantity; 
		  }
		  
		  public void carStockValue(){
		    
		    double stockValue = this.price * this.quantity; 
		    
		    System.out.println(model + " Stock Value " + stockValue);
		  }
		  
		}
	
	  public static void main(String[] args) {
		    CarObjects toyotaCar = new CarObjects("Toyota 2019", 25000,100); 
		    toyotaCar.carStockValue(); 
		    
		     CarObjects bmwCar = new CarObjects("BMW 2019", 65298,10); 
		    bmwCar.carStockValue();
		  }
		}