package com.Review10_class30;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;



public class SetIntro {
	
	public static void main (String[]args) {
		
//                               _______Collection________
//List                   |                Set                         |      Queue
//ArrayList LinkedList   |  HashSet LinkedHashSet  TreeSet            |
	
	Set<String>africa=new HashSet<>();
	africa.add("Tunisia");
	africa.add("Morocco");
	africa.add("Kenya");
	africa.add("Algeria");
	//africa.add(2,"Egypt");//You cannot add with an index 
	
	//in a set you can only have one number {1,2,3,4,5} not {1,2,3,3,4,5} bc duplicated
	
	System.out.println(africa);//print the whole set in diff order bc HashSet
	
	Set<String>africaLinked=new LinkedHashSet<>();
	africaLinked.add("Tunisia");
	africaLinked.add("Morocco");
	africaLinked.add("Kenya");
	africaLinked.add("Algeria");
	
	System.out.println("LinkedHashSet: "+africaLinked);//in order presented
	
	Set<String>africa2=new HashSet<>(africaLinked);
	System.out.println("HashSet: "+ africa2);//random order
	
	Set<String>africa3=new TreeSet<>(africaLinked);
	System.out.println("TreeSet: "+africa3);//will print in alphabetical order
	
	int size=africa2.size();
	boolean contains=africa2.contains("Kenya");
	boolean isEmpty=africa2.isEmpty();
	boolean ableToRemove=africa2.remove("Algeria");//if alrgeria is in the list then remove. Hover over it
	//you are not able to remove by index---> africa2.get(2);
	
	//1st way,Does NOT work in a Set, bc we dont have get(i);
//	for (int i = 0; i < europe.size(); i++) {
//		String country = europe.get(i);
//		System.out.print(country + " ");
//	}
	//2nd Way: enhanced/advanced for loop
	System.out.println("---using enhanced/advanced loop----");
	for (String country:africa2) {
		System.out.print(country+ " ");
	}
	System.out.println();
	
	//3rd Way, using iterator
	System.out.println("-----using iterator------");
	Iterator<String>it=africa2.iterator();
	while (it.hasNext()) {//if it has a next one ?
	       String country=it.next();//if yes then print it
	       System.out.println(country+" ");
	}
	//1.List preserves insertion order,BuT Set doesn't
	//2.List contains duplicates,But Set contains unique
	
	Set<String>europe=new HashSet<>();
	europe.add("Albania");
	europe.add("France");
	europe.add("Spain");
	europe.add("Portugal");
	europe.add(null);
	
	System.out.println(europe);
	
	//Collection Framework
	//Collection is Class
	String minimum=Collections.min(africa2);
	System.out.println(minimum);
	
	Set<Integer>numbers=new HashSet<>();
	numbers.add(56);
	numbers.add(23);
	numbers.add(49);
	numbers.add(93);
	numbers.add(17);
	
//	for (Integer obj:numbers) {
//		System.out.print(obj+" ");   YOU CAN PRINT THIS WAY
//	}
	
	Integer minInt=Collections.min(numbers);
	Integer maxInt=Collections.max(numbers);
	System.out.println("Numbers from "+minInt+" to "+maxInt);
	
	}
}
