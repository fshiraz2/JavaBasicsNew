package com.syntax.class16;

public class InstanceVariables {

	String name="John";//instance variable: variable declared inside class but outside method/block.
	
	public static void main (String[]args) {
		
		String name="Yunus";//local variable(local to main method).
		
		System.out.println(name);//Yunus will print 
		
		InstanceVariables object=new InstanceVariables();//we need this to access the name John
		System.out.println(object.name);//John will print
		
		//changing value of instance variable, changing from John to Ali
		object.name="Ali";
		System.out.println(name);
		System.out.println(object.name);
		
		//change value of local variable,change Yunus to Farid
		name="Farid";
		System.out.println(name);
		
		
	}
	
}
