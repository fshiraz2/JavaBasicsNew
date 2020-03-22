package com.syntax.class15;

public class Methods {

	//create a method that says welcome 10 times
	
	void sayWelcome(){
		for (int i=0;i<10;i++) {
			System.out.println("Welcome");
		}
	}
	//create method that will say any word number of
	
	void sayAnything(String word,int times) {
		for (int i=1;i<times;i++) {
			System.out.println(word);
		}
	}
	//create a method isItRaining
	//that will accept boolean value as parameter
	//and based on the value,it will print message accordingly
	
	void isItRaining (boolean isRain) {
		if (isRain) {
			System.out.println("It is raining,stay home and learn Java");
		}else {
			System.out.println("It is not raining,go for a walk");
		}
	}
		void evenOrOdd (int a) {
			if (a%2==0) {
				System.out.println(a+"is an even number");
			}else {
				System.out.println(a+"is an odd number");
			}
		}
		void isLarger(int a,int b) {
			if (a<b) {
				System.out.println(b+" is larger than "+a);
			}else {
				System.out.println(a+" is larger than "+b);
			}
		}
			void isPalindrome(String word) {
				char []array=word.toCharArray();
				String reverse = null;
				for (int i=array.length-1;i>=0;i++) {
					reverse+=array[i];
				}
				if(reverse.equalsIgnoreCase(word)) {
					System.out.println("Word is palindrome");
				}else {
					System.out.println("Word is not Palindrome");
				}
			}
			
			void sayHello(String country) {
				switch (country.toLowerCase()) {
				case "Russia" :
				System.out.println("Privet");
				break;
				case "Tajikistan":
					System.out.println("Salam");
					break;
				case "Mexico":
				System.out.println("Hola");
				break;
				default:
					System.out.println("wrong language");
				}
			}
		}
	

