package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Finbonacci {
//	Create Linked List that will store first 10 numbers of fibonacci series
//
//	Print number from Linked List 1 by 1 all in 1 line
//
//	Expected Output:
//	0 1 1 2 3 5 8 13 21 34 
	
	
		public static void main(String[] args) {
			
			List<Integer> llist=new LinkedList<>();
			int a=0;
			int b=1;
			int c;
			
			for(int i=1; i<=10; i++) {
				
				llist.add(a);
				c=a+b;
				a=b;
				b=c;
			}
			
			for(int num:llist) {
				System.out.print(num+" ");
			}
	}
	}
