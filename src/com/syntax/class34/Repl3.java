package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Create a method that will not be handling exception and throwing it at caller.
//In main method call method and handle the exception.

//Expected Output:
//java.io.FileNotFoundException:  (No such file or directory)


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	class Repl3 {
	  public static void main(String[] args) {
			try {
				read("");
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
		}
		public static void read(String filePath) throws FileNotFoundException {
			FileInputStream fis = new FileInputStream(filePath);
		}
	}

