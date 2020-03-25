package com.syntax.class16;

public class LocalVariables {

	void nameInside(){
		//local variable bc scope of this variable lives only within the body of this method
		String name="John";//local variable visible only whithin method it is declared in
		
		}
	public static void main (String[]args) {
		
		//System.out.println(name); CE bc name won't be visible to another method since 
		//its scope is only within nameInside method
		
		LocalVariables obj=new LocalVariables();
		obj.nameInside();
		
		
		boolean flag=true;
		
		if(flag) {
			String answer="Yes";//this variable is local/visible only to this if block
		}
		//System.out.println(answer);CE: scope of variable answer is not visible outside of if block
		
		for (int i=1;i<=5;i++) {
			System.out.println(i);
		}
		//no error bc is is inside its own loop 
		for (int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
