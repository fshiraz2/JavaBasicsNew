package com.syntax.class21;

class Largest {
	
		  
	 static int maxValue(int [] arr){
		    for (int i = 1; i < arr.length; i++) {
							int maxValue = 0;
							if (arr[i] > maxValue) {
								maxValue = arr[i];
		  }
							
		    }
		    return maxValue(arr);
		
		
	 }
		  
		    
			public static void main(String[] args) {
				int[] arr = {5,12,-3,7,3,22};
				System.out.println(maxValue(arr)); //should print 22
			}
			
			
		}