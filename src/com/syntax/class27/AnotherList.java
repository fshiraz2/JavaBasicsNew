package com.syntax.class27;

import java.util.ArrayList;
//Create an array list to type String. 
//Add these values below to your arraylist
//hi
//yo
//sup
//yolo
//boop
//
//Remove 1, 3, 5 element from an array
//
//print remained values one by one in one line
//
//Expected Output:
//yo yolo 
class Main{
	public static void main(String[] args){
		ArrayList<String> arrlist=new ArrayList<>();
		
		arrlist.add("hi");
		arrlist.add("yo");
		arrlist.add("sup");
		arrlist.add("yolo");
		arrlist.add("boop");
		
		arrlist.remove(0);
		arrlist.remove(1);
		arrlist.remove(2);
		
		for (String object : arrlist) {
			System.out.print(object+" ");
		}
	}
}