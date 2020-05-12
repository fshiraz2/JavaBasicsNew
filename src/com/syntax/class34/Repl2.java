package com.syntax.class34;
public class Repl2 {
		  public static void main(String[] args) {
		     try{  int a[] = {10,20,30};
		            System.out.println(a[4]);
		        } 
		        catch(ArrayIndexOutOfBoundsException e){ 
		            e.printStackTrace(); 
		        } 
		  }
		}
//Expected Output:
//java.lang.ArrayIndexOutOfBoundsException: 4
//	at Main.main(Main.java:5)