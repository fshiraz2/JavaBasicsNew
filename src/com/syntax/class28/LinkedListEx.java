package com.syntax.class28;
import java.util.Iterator;
//Create a Linked List that will store Integer Objects from 50-100.
//Once Linked List is created remove all numbers that are not divisible by 3.
//
//Print Linked List
//
//Expected Output:
//[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main (String[]args) {
		List<Integer>num = new LinkedList<>();
		for(int i=50;i<=100;i++) {
			num.add(i);
		}
		
		Iterator<Integer>it=num.iterator();
		while(it.hasNext()) {
			if(it.next()%3 != 0){
				it.remove();
			}
		}
		
		System.out.println(num);
	}
}
	


