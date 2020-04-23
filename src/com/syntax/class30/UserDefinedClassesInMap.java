package com.syntax.class30;

import java.util.LinkedHashMap;

public abstract class Store {

	String type,name;
	public Store(String type,String name) {
		this.name=name;
		this.type=type;
	}
	public void display() {
		System.out.println("This is store "+name);
	}
	public abstract void workingHours();
}

class Nike extends Store{
	public Nike(String type,String name) {
	super(type,name);
	}
	public void workingHours() {
		System.out.println(name+" works from 10 am till 6pm");
	}
	
}
class Costco extends Store{

	public Costco(String type, String name) {
		super(type, name);
		
	}
	@Override
	public void workingHours() {
		System.out.println(name+" works from 8 am until 8 pm");
}
	
}
class Amazon extends Store{

	public Amazon(String type, String name) {
		super(type, name);
		
	}
	@Override
	public void workingHours() {
		System.out.println(name+" works 24/7");
}
	
}
public class UserDefinedClassesInMap{
	public static void main(String[]args) {
		//we want to store in form 1-->Amazon,2-->Costco,3-->Nike
		
		Map<Integer,Store>storeMap=new LinkedHashMap<>();
		store
	}
}