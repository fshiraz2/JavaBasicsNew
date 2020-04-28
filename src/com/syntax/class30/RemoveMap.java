package com.syntax.class30;
import java.util.*;
import java.util.Map.Entry;
public class RemoveMap {

	
		public static void main (String[] args) {
	Map <String, String> map=new HashMap<>();
	map.put("ONE","AAA");
	map.put("TWO","BBB");
	map.put("THREE","CCC");
	map.put("FOUR","DDD");
	map.put("FIVE","EEE");
	System.out.println("HashMap Before Remove:");
	Set<Entry<String, String>> entries = map.entrySet();
	for (Entry<String, String> entry : entries) {
		System.out.println(entry);
	}
	map.remove("ONE");
	map.remove("FOUR");
	System.out.println("HashMap After Remove");
	Set<Entry<String, String>> entries1 = map.entrySet();
	for (Entry<String, String> entry : entries1) {
		System.out.println(entry);
	}
		}
		}
