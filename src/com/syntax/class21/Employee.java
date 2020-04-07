package com.syntax.class21;

public class Employee {

	
		  String name;
		  String lastName;
		  int employeeId;
		  String startDate;
		  int salary;
		  
		  public Employee(){
			    
		  }
		  public Employee(String name,String lastName,int employeeId,String startDate,int salary){
		    this.name=name;
		    this.lastName=lastName;
		    this.employeeId=employeeId;
		    this.startDate=startDate;
		    this.salary=salary;
		    
		  }
		  
		 
		  public void displayMethod(){
		    System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
		  }
		  public static void main (String []args){
			  Employee obj=new Employee();
			  obj.displayMethod();
			  
			 Employee obj1=new Employee("Joe","Smith",12345,"01/01/1970",3500);
			 obj1.displayMethod();
			 
			
		}
		}