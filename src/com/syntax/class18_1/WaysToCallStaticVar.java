package com.syntax.class18_1;

public class WaysToCallStaticVar {

	  static String ss="Welcome to SyntaxTechnologies";


	  public static void main (String[]args){
	   
	    System.out.println(ss);//calling directly
	    
	    System.out.println(WaysToCallStaticVar.ss);//calling by className
	    
	    WaysToCallStaticVar obj=new WaysToCallStaticVar ();
	    System.out.println(obj.ss);//calling by object


	    

	  }
	  }
