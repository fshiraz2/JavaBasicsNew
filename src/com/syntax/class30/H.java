package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;
//Create a Map in which you do not need to preserve the order
//of the entries
//Add below pair to it . 
//
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//
//Find how many entries are inside the map
//Remove all entires from the Map
//Find the Map size again
public class H {
	public static void main(String[] args) {
		Map<String, String> st = new HashMap<>();
		st.put("Street", "Patrick ST");
		st.put("Suite", "265");
		st.put("City", "Vienna");
		st.put("Zip", "22180");
		st.put("Country", "United State");
		System.out.println(st.size());
		st.clear();
		System.out.println(st.size());


		
}
}
