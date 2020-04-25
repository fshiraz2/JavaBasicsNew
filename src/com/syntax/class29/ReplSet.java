package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReplSet {
	public static void main(String[] args) {
	    
	    // Create a HashSet
	    Set<S> set = new LinkedHashSet<>();
	 
	     //add elements to HashSet
	     set.add(new S("Samir", "Jawaid", 101));
	     set.add(new S("Asel", "Umurzakova", 102));
	     set.add(new S("Diego", "Juarez", 103));
	     set.add(new S("Sohil", "Aryan", 104));
	     set.add(new S("Alijon", "Nazarov", 105));
	 
	     for(S stu : set){
	        stu.displayDetails();
	     }
	    
	  }
	}
//Expected Output:
//Student details: Samir Jawaid with id: 101
//Student details: Asel Umurzakova with id: 102
//Student details: Diego Juarez with id: 103
//Student details: Sohil Aryan with id: 104
//Student details: Alijon Nazarov with id: 105




//	Create a student class that will have variables as: studentId, name and lastName
//  constructor
//	method to display students details
//
//	Create a set that will store 5 different students in an order they been added to the collection.
	class S{
		  
		  public String name, lastName;
		  public int studentId;
		  
		  public S(String name, String lastName, int studentId){
		    this.name=name;
		    this.lastName=lastName;
		    this.studentId=studentId;
		  }
		  
		  public void displayDetails(){
		    System.out.println("Student details: "+name+" "+lastName+" with id: "+studentId);
		  }
	}
	


  


