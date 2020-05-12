package com.syntax.class34;

import java.io.BufferedReader;
import java.io.FileReader;

//Create a method that will do temperature check.
//Anytime user passes temperture that is below 32 method should throw an
//Exception saying "It is freezing"
//
//In Main method call the method and handle an Exception
//
//Expected Output: 
//java.lang.RuntimeException: It is freezing
public class Repl4 {
		  public static void main(String[] args) {
		    try {
		      temperatureCheck(31);
		    } catch(RuntimeException re){
		      System.out.println(re);
		    }
		  }
		  public static void temperatureCheck(double temp){
					if (temp <32) {
				  	throw new RuntimeException("It is freezing");
					} else {
					  System.out.println("Weather is good");
					}
		  }
		}

