package com.syntax.class25;

public class AnotherMethodOveride {
		  void hello(){
		    System.out.println("method in Parent class");
		  }
		}
class Child1 extends AnotherMethodOveride{
	 void hello(){
	    System.out.println("method in Child1 class");
	  }
	}
class Child2 extends AnotherMethodOveride{
	 void hello(){
	    System.out.println("method in Child2 class");
	  }
	}
class Child3 extends AnotherMethodOveride{
	 void hello(){
	    System.out.println("method in Child3 class");
	  }
	

	  public static void main(String[] args) {

		AnotherMethodOveride[] pp= {new Child1(),new Child2(), new Child3()};
	    for (AnotherMethodOveride p: pp){
	      p.hello();
	    }
	  }
}
	   
	  
	