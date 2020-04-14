package com.syntax.class26;

public class Employee {

	//define private variables
		private String name;
		private int age;
		private double salary;
		
		//define public methods to give an access to private variables
		
		public void setName(String name) {//setter uses this.variable
			if(!name.isEmpty() && name.length()>3) {//the name that u are passing cannot be empty and can be only more than 3 characters
				this.name=name;//ex is when making a gmail account, it will tell you username requirements
			}
		}
		
		public String getName() {//in get u use return
			return name;
		}
		//to provide specific verification we use setter.setters use this.variable.
		public void setAge(int age) {
			if(age>1) {
				this.age=age;
			}
		}
		
		public int getAge() {
			return age;
		}
		
		public void setSalary(double salary) {
			this.salary=salary;
		} 
		
		public double getSalary() {
			return salary;
		}	
	}
//u do set first then get for each variable.this is up to you.
//you want to get setter bc they help access the variable. you set values to variables
//In setters u allow user to set specific value to variable.
