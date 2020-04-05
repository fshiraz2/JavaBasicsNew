package com.Review07_class21;

public class Doctor {
static String hospitalName;
String name;
String licenceId;
int salary;
//one more variable added
String address;
//Doctor(){
	
//}
public Doctor(String name,String licenceID, int salary) {
	this.name=name;
	this.licenceId=licenceID;
	this.salary=salary;
	
}
public Doctor(String name,String licenceId,int salary,String address) {
	this(name,licenceId,salary);
	this.address=address;
}
public void checkUp(String patientName) {
	System.out.println(" Doctor "+name+" has ordered blood test");
}
public void treatPatient(String patientName) {
	System.out.println("Doctor "+this.name+" gives prescription to "+patientName);
	//calling a method inside a method
	chargePatient();
}
public void chargePatient() {
	System.out.println("Let me charge $100.00");
}
public void displayInfo() {
	System.out.println("Doctor "+name+ " with "+licenceId+ " has salary "+salary);
}

public  static void payBills() {
	//System.out.println("Doctor "+name);//non-static variables cannot be used
	System.out.println("Everybody pays bills in "+hospitalName);//u can access static variables
}
}


