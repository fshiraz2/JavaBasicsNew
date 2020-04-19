package com.syntax.class27;

//Create an array list that will hold String Objects
//Find out wether array list is empty or not. 
//Add String value "Syntax" to it
//Find out wether array list is empty or not. 
//
//Expected Output:
//true
//false


import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

       ArrayList<String> list = new ArrayList<>();
       System.out.println(list.isEmpty());  
        list.add("Syntax");
        System.out.println(list.isEmpty()); 
  }
}
