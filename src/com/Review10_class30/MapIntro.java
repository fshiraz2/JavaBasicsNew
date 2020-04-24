package com.Review10_class30;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIntro {
//                                     ____MAP____
//    HashMap         LinkedHashMap    TreeMap       HashTable
	public static void main (String[]args) {
		Map<Integer,String>phoneBook=new HashMap<>();
	    phoneBook.put(123459889, "John Smith");
		phoneBook.put(123411189, "James London");
		phoneBook.put(123456789, "Rohani Smith");
		phoneBook.put(123456389, "Donald Trump");
		phoneBook.put(111111111, "Obama");
		phoneBook.put(123456729, "Brad Pitt");
		
		String name=phoneBook.get(123456729);
		System.out.println(name+" is calling");
		
		String name2=phoneBook.get(55555);
		System.out.println(name+" is calling");
		
		boolean contains=phoneBook.containsKey(55555);
		System.out.println(555555+" is in the map "+contains);
		
		boolean contains2=phoneBook.containsValue("Julia Roberts");
		System.out.println("Julia Roberts is in my contact list: "+contains2);
		
		//We can have duplicate values, but no duplicate keys.
	  
		// Will remove Trump from my list
				phoneBook.remove(456789012);

				System.out.println(phoneBook);

				phoneBook.isEmpty();

				//////////////////////////////////////////////
				// Let's get all the keys and store them in a Set
				System.out.println("--------keySet()--------");
				Set<Integer> keys = phoneBook.keySet();
				Iterator<Integer> it = keys.iterator();
				while (it.hasNext()) {
					Integer key = it.next();
					String value = phoneBook.get(key);
					System.out.println(key + "->" + value);
				}

				// Let's get all the values and store them in a Collection
				System.out.println("--------values()--------");
				Collection<String> values = phoneBook.values();
				for (String value : values) {
					System.out.println(value);
				}

				// Let's get all the entries and store them in Set
				System.out.println("--------entrySet()--------");
				Set<Entry<Integer, String>> entries = phoneBook.entrySet();

				// 1st way, using enhanced for loop
				for (Entry<Integer, String> entry : entries) {
//					 System.out.println(entry);

//					Integer key = entry.getKey();
//					String value = entry.getValue();
//					System.out.println(key + " ---> " + value);

					System.out.println(entry.getKey() + " ---> " + entry.getValue());
				}
				
				System.out.println("--------iterator--------");
				// 2nd way, using iterator
				Iterator<Entry<Integer, String>> entryIt = entries.iterator();
				while (entryIt.hasNext()) {
					Entry<Integer, String> entry = entryIt.next();
					System.out.println(entry.getKey() + ":" + entry.getValue());
				}
			}

		}
		
		
	
