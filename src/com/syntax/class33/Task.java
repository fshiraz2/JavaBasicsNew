package com.syntax.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//How would handle InputMismatchException?
//Input Mismatch Exception when user enters mismatch value then programmer expected.
//
//
//Create a static method that will return a List of Exceptions.
//Inside your method create objects of 4 exception classes using try and catch blocks 
//and store them inside your list.
//Call your method inside main and print name and details of all Exception objects.
public class Task {

	public static void main(String[] args) {
        //to call all methods bc static 
		List<Exception> list = getAllExceptions();
		//System.out.println(list.size());

		//to print using iterator
		Iterator<Exception> eit = list.iterator();
		while (eit.hasNext()) {//loop through all objects
			eit.next().printStackTrace();//you can use this instead of get message.Tells everything!
		}
	}

	public static List<Exception> getAllExceptions() {
		List<Exception> exceptionList = new ArrayList<>();

		// 1 object of exception type
		int[] array = { 1, 2, 3 };
		try {
			System.out.println(array[4]);
		} catch (ArrayIndexOutOfBoundsException aob) {
			exceptionList.add(aob);
		}

		// 2 object of exception type
		try {
			Object ob = new Double(50);
			Integer i = (Integer) ob;
		} catch (ClassCastException e) {//when you try to cast and not correct
			exceptionList.add(e);
		}

		// 3 object of exception type
		int a = 10;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			exceptionList.add(ae);
		}

		// 4 object of exception type
		try {
			int[] negArray = new int[-1];
		} catch (NegativeArraySizeException e) {
			exceptionList.add(e);
		}

		return exceptionList;
	}
}
