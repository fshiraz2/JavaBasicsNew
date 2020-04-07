package com.syntax.class22;

public class LargestString {
	 
		
		public static void main(String[] args) {
			String[] arr = {"hey","yolo","hi","this is long"};
			System.out.println(maxLength(arr));
			//should print "this is long"
		}
		protected static String maxLength(String[]arr) {
		int index = 0; 
		int elementLength = arr[0].length();
		for(int i=1; i< arr.length; i++) {
		    if(arr[i].length() > elementLength) {
		        index = i; elementLength = arr[i].length();
		    }
		}
		return arr[index];
		}
}
