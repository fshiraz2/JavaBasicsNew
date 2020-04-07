package com.syntax.class23;

public class SuperConstructor {



  public SuperConstructor(){
    System.out.println("Parent Constructor without argument");
  }
  
  public SuperConstructor(int number){
    System.out.println(number);
  }
}
class Childs extends SuperConstructor{
  public Childs(){
    System.out.println("Child Constructor without argument");
    
  }
   public Childs(int number){
    super(number);
  }
}



