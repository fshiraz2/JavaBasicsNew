package com.syntax.class30;
//HashMap, Methods, reusability, Logic
//Create a Method in Main class using below specification. 
//Method Name: Display. 
//Return Type: Void
//Parameters : Map<String,Integer>
//Logic: 
//First the method will check the given map is empty or not. 
//If the map is not empty print pairs of key and value using loops
//If map is empty simply print "map is empty"
//
//NOW IN MAIN METHOD
//Create HashMap of String keys and Integer values
//add values as below
//map.put("mango", 10); 
//map.put("apple", 30); 
//map.put("orange", 20); 
//
//using created display method to display. 
//
//then clear the map. 
//
//use the same method to display
import java.util.*;
import java.util.Map.Entry;
class MAP {
	static void display(Map<String,Integer>map) {
	if(map.isEmpty()) {
		System.out.println("map is empty");
	}else {
		for(Entry<String,Integer>key:map.entrySet()) {
			System.out.println(key.getKey()+"="+key.getValue());
		}
	}
		}
	public static void main (String[] args) {
			    Map<String, Integer> map1= new HashMap<>();
			    map1.put("mango", 10);
			    map1.put("apple", 30);
			    map1.put("orange", 20);
			    MAP.display(map1);
			    map1.clear();
			    MAP.display(map1);
	}
}
