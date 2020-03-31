package com.syntax.class19;

public class USA {

String state, stateCapital;
	
	public USA(String state, String stateCapital) {
		//initialize the instance variables
		//we use this. to keep the same variable name
		
		this.state=state;//this=pointing out to current instance variables
		this.stateCapital=stateCapital;
	}
	//you cannot explicitely call constructor in main method, you need to make constructor to print.
	public void displayState() {
		System.out.println(state);
	}
	
	public void displayStateCapital() {
		System.out.println(stateCapital);
	}
	
	//can I call a method inside another method? --> YES
	public void displayInfo() {
		//this.displayState();
		displayState();//by default compiler adds this keyword to a method, thats why in line 25 u don't need to write it that way.
		displayStateCapital();
	}
	
	public static void main(String[] args) {
		USA state1=new USA("Texas", "Austin");
		state1.displayInfo();//the output will be Texas then Austin
		
		state1=new USA("Georgia", "Atlanta");
		state1.displayInfo();
	}
	
}
