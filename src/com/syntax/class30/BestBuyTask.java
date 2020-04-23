package com.syntax.class30;

import java.util.Map;
import java.util.TreeMap;

public class BestBuyTask {
//  Create a map of Best Buy store. Place item id and item name into it. 
//	Example (7664847 = Printer, 7879885= TV etc )
//	Retrieve all keys and values from a Best Buy map using EntrySet.

public static void main(String[] args) {
		
	
	Map<Integer, String> bestbuy = new TreeMap<>();
	
	bestbuy.put(1989, "Printer");
	bestbuy.put(1880, "Macbook");
	bestbuy.put(9989, "TV");
	bestbuy.put(8808, "PC");
	System.out.println(bestbuy);
	
	for(Map.Entry<Integer, String> entries: bestbuy.entrySet()) {
            System.out.println(entries);
	
	}
}
}