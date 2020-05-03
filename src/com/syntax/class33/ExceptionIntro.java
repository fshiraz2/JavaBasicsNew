package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {
	
	static String str;

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		int a=10;
		int b=0;
		
		//System.out.println(a/b);--> ArithmeticException will come in console
		
		System.out.println("End of the program");
		
		int[] array= {12,1,13};
		//System.out.println(array[3]); --> ArrayIndexOutOfBoundsException, bc 3 is not in there
		
		//System.out.println(str.length());--> NullPointerException, bc its not string
		
		NullPointerException npe=new NullPointerException();//object of class
//		throw(npe); java gets hit bc you throw and stops execution
	
		//***all of the above are  unchecked exceptions, 
		//they are not checked by compliler, until actual program is runned.
		
		Thread.sleep(2000);
		
		String filePath="";
		
		FileInputStream fis=new FileInputStream(filePath);

	}
}
