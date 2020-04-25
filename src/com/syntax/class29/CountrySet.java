package com.syntax.class29;
//import java.util.*;used for importing everything!
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CountrySet {
	public static void main(String[]args){
	  	Set<String> countries = new TreeSet<>();//TreeSet when we want in abc order
			countries.add("India");
			countries.add("Australia");
			countries.add("South Africa");
			countries.add("India");
			countries.add("America");
			countries.add("America");
		System.out.println(countries);
		
		System.out.println("----COLORS----");
		Set<String>colors=new HashSet<>();
		colors.add("Red");
		colors.add("Pink");
		colors.add("Yellow");
		colors.add("White");
		colors.add("Black");
		System.out.println("Original Hash Set: "+colors);
		System.out.println("Size of the Hash Set: "+colors.size());//When we want to print setSize
		
		System.out.println("---RANDOM-----");
		Set<String>random=new LinkedHashSet<>();//LinkedHashSet when we want in order presented
		random.add("null");
		random.add("Sohil");
		random.add("Diego");
		random.add("Alijon");
		random.add("Asel");
		random.add("Sumair");
		//random.forEach(System.out::println);
		//One way to print twice
//		Iterator<String>it=random.iterator();
//		while (it.hasNext()) {
//		       String name=it.next();
//		       random.forEach(System.out::println);
//		       random.forEach(System.out::println);
//		       break;
//		}
		
		//instructor way to print twice 
		   for(String name:random){
		          System.out.println(name);
		        }
		        
		        Iterator<String> it=random.iterator();
		        while(it.hasNext()){
		          System.out.println(it.next());
		        }
		
	}
		
	}

