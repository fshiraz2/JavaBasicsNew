package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		String[] cities={"Washington D.C.","NY","Paris","Miami","Los Angeles","Dallas","Chantilly"};
		
		int x=1;
		System.out.println(cities[x]);
		x+=3;
		System.out.println("I moved to "+cities[x]);
		
		//how many elements stored inside am array?
		int arraySize=cities.length;
		System.out.println("Total elements "+arraySize);
		//how can we access last element from an array?
		System.out.println(cities[arraySize-1]);
		
		//access all elements from an array
		for (int i=0;i<arraySize;i++) {
			System.out.println(cities[i]);
		}

	}

}
