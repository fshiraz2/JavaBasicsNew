package com.syntax.class28;
//Create an Linked List that will store all prime numbers from 1 to 100
//
//Step 1. Create a method that will identify wether number is prime or not
//Step 2. Add all prime numbers into Linked List




	import java.util.*;

	class PrimeEx {
	public static void main(String[] args) {
			List<Integer> primeNumbers = new LinkedList<>();
			for (int i = 2; i <= 100; i++) {
				if (isPrime(i)) {
					primeNumbers.add(i);
				}
			}

			System.out.println(primeNumbers);
		}

		public static boolean isPrime(int number) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
		
		
