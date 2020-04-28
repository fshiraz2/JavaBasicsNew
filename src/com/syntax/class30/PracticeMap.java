package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PracticeMap {
public static void main(String[]args) {
	Map<String,String> fruits=new LinkedHashMap<>();
	fruits.put("1 item", "apple");
	fruits.put("2 item", "banana");
	fruits.put("3 item", "pear");
	fruits.put("4 item", "tomato");
	fruits.put("5 item", "mango");
	fruits.put("6 item", "kiwi");

	
	//1st WAY
//	Set<Entry<String, String>> entries=fruits.entrySet();
//	Iterator<Entry<String, String>>it=entries.iterator();
//	while(it.hasNext()) {
//		Entry<String, String> entry=it.next();
//		String myEntry="Key is "+entry.getKey()+" and value is "+entry.getValue();
//		System.out.println(myEntry);
	
	//2nd WAY
	  String pair;
      for(String key: fruits.keySet()){
        pair="Key is "+key+" and values is "+fruits.get(key);
        System.out.println(pair);
      }
}
}

