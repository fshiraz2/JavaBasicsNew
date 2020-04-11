package com.syntax.class25;

public class MethodOveriding {
	
		  public void method1(){
		    System.out.println("I am parent public/protected/default/private method.");
		  }
		  protected void method2(){
		    System.out.println("I am parent public/protected/default/private method.");
		  }
		 void method3(){
		    System.out.println("I am parent public/protected/default/private method.");
		  }
		  private  void method4(){
		    System.out.println("I am parent public/protected/default/private method.");
		  }
		}
class Child extends MethodOveriding{
    public void method1(){
    System.out.println("I am a child public method");
  }
  protected void method2(){
    System.out.println("I am a child protected method");
  }
 void method3(){
    System.out.println("I am a child default method");
  }

  }
class Main {
public static void main (String[]args){
  Child c=new Child();
  c.method1();
  c.method2();
  c.method3();
}
}


