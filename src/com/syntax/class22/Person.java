package com.syntax.class22;



public class Person {

		 String  name;
		 String lastName;
		 int age;
		 
		 
}
class Emp extends Person{
	int salary;
	  
	  void print(){
	    
	    System.out.println(name + " " + lastName + " " + age + " " + salary);
	  }
	}
class Student extends Person{
	int grade;
	  
	   void print(){
	    
	    System.out.println(name + " " + lastName + " " + age + " " + grade);
	  }
	 
	}
class Retiree extends Person{
	String seniorActivity;
	  
    void print(){
   
   System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
 }
 
}

