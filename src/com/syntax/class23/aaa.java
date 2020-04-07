package com.syntax.class23;

public class aaa {

	class ShoppingStore{
		  
		  String item; 
		  double price; 
		  double quantity; 
		  
		  public ShoppingStore(String item, double price, double quantity){
		    this.item = item; 
		    this.price = price; 
		    this.quantity = quantity; 
		  }
		  
		  public double getItemTotalPrice(){
		    double totalPrice = this.price * this.quantity ; 
		    
		    System.out.println(this.item + " Total Value " + totalPrice);
		    
		    return totalPrice;
		  }
		}
	
	
	
	class Mains {
		  public void main (String[] args) {
		      ShoppingStore blancket = new ShoppingStore("Blanket" , 49.99, 2);
		      ShoppingStore mattress = new ShoppingStore("Mattress" , 219.59, 2);
		      
		      double blanketTotalPrice = blancket.getItemTotalPrice(); 
		      double mattressTotalPrice = mattress.getItemTotalPrice(); 
		      double sumPurchase = blanketTotalPrice + mattressTotalPrice; 
		     
		      System.out.println("You purchased " + sumPurchase + " Today");
		  }
		}
}
