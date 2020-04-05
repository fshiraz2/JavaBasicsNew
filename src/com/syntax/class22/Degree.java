package com.syntax.class22;

public class Degree {
/*
 *1) Create a class ‘Degree’ having a method ‘getPrerequisite’ that prints “”To get a degree you need high school 
 diploma”“. Class ‘Degree’ has 2 subclasses namely ‘Bachelors’ and Masters’.
 In Masters class override method ‘getPrerequisite’.
Call the method by creating an object of each of the three classes.
 */
	void getPrerequisite() {
		System.out.println("to get a degree you need a high school diploma");
	}
}
class Bachelors extends Degree{
}
class Masters extends Degree{
	void getPrerequisite() {
		System.out.println("get prerequisite");
	}
}public class TestDegree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Degree diploma=new Degree();
		 diploma.getPrerequisite();
		 Bachelors bach=new Bachelors();
		 bach.getPrerequisite();
		 Masters ma=new Masters();
		 ma.getPrerequisite();
	}
}
