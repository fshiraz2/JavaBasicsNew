package com.syntax.class28;

	//2. hw create food class that will have 3 undefined methods and it will have 4 subclasses;
	//create a collection of food and using 3 ways execute methods
	

	import java.util.ArrayList;
	import java.util.Iterator;

	public class HW2 {

		public static void main(String[] args) {

			ArrayList<Integer> nums = new ArrayList<>();

			for (int x = 0; x <= 50; x += 2) {
				nums.add(x);
			}

			System.out.println(nums);

			Iterator<Integer> n = nums.iterator();
			
			while (n.hasNext()) {
				if (n.next() % 5 == 0) {
					n.remove();
				}
			}
			
			System.out.println(nums);
		}

	}
