package com.syntax.class28;



	import java.util.LinkedList;

	class SumLinkedList {
	  public static void main(String[] args) {
			LinkedList<Integer> list = new LinkedList<Integer>(); 
			list.add(111);
			list.add(222);
			list.add(333);
			list.add(444);
			list.add(555);
			list.add(666);
			
			int result = 0; 
			
			for (Integer value : list) {
				result = result + value;
			}
			
			System.out.println("Result of sum is " + result);
		}
	}