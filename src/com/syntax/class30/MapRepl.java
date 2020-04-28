package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapRepl {
//	Create A Map that will preserve an order of entry objects
//
//	Add below pairs :
//
//	"Street" = "Patrick ST"
//	"Suite" = "265"
//	"City" = "Vienna"
//	"Zip" = "22180"
//	"Country" = "United State"
//
//	Print all values of from the map 
//
//	Expected Output:
//	Patrick ST
//	265
//	Vienna
//	22180
//	United State
	public static void main (String[]args) {
			Map<String, String> st = new HashMap<>();
			st.put("Street", "Patrick ST");
			st.put("Suite", "265");
			st.put("City", "Vienna");
			st.put("Zip", "22180");
			st.put("Country", "United State");
			
//			Collection<String> values=st.values();
//			Iterator<String> it=values.iterator();
//			while(it.hasNext()) {
//				System.out.println(it.next());
			
//       PRINTING UPERCASE USING ENTRYSET:
//			  String value;
//		  	for (Entry<String, String> entry : setEntry) {
//			  	 value = entry.getValue().toUpperCase();
//			  	System.out.println(value);
			 for (String keys : st.keySet()){
		          System.out.println(st.get(keys).toUpperCase());
			}
	}


}


