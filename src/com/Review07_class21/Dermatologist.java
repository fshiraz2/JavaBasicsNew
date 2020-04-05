package com.Review07_class21;

public class Dermatologist extends Doctor {
String dermaId;
	public Dermatologist(String name,String licenceId,int salary, String dermaId) {
		super(name,licenceId,salary);
	//	this.name=name;
	//	this.licenceId=licenceID;
	//	this.salary=salary;
		this.dermaId=dermaId;
	}
public void skinTest() {
	System.out.println("Lets do a skin test");
}
}
