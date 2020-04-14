package com.syntax.class26;

public class EncapsulationTest {
//testing employee class
public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setName("");//assign any value
		System.out.println(emp.getName());
		//getter allows just to read variable-->null
		//with the help of setter,it give you ability to write access
	}
}