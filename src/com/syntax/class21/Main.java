package com.syntax.class21;

public class Main {

	String schoolName;
	static int batch;
	int year;
	static String lastDayOfClass;

	
	void displayMethod(String schoolName,int batch,int year,String lastDayOfClass){
	   
	 this.schoolName=schoolName;
	 this.batch=batch;
     this.year=year;
	 this.lastDayOfClass=lastDayOfClass;
	 
	  System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	
	public static void main (String[]args){
	Main obj1=new Main();
	obj1.displayMethod(lastDayOfClass, batch, batch, lastDayOfClass);
	
	Main obj2=new Main();
	obj2.displayMethod("Syntax", 6, 2020, "07/30/2020");
}
}
