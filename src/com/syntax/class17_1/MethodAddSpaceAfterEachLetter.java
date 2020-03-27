package com.syntax.class17_1;
//
class MethodAddSpaceAfterEachLetter{

 public static void main(String[] args) {
	 MethodAddSpaceAfterEachLetter obj=new MethodAddSpaceAfterEachLetter();
		System.out.println(obj.spaceOut("hello"));
		System.out.println(obj.spaceOut("technology"));
	}
	
	String spaceOut(String s) {
		
		String newString="";
		
		for(int i=0; i<s.length(); i++ ) {
			newString=newString+s.charAt(i)+" ";
		}
		
		return newString;
	}
}
