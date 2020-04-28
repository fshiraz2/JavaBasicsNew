package com.syntax.class30;
import java.util.*;
import java.util.Map.Entry;
public class MapReplace {



		 public static void main(String[]args){
		   Map<String,String> map=new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		System.out.println("Hashmap Before Replace");
		Set<String> keys=map.keySet();
		Iterator <String> it=keys.iterator();
		while(it.hasNext()){
		  String key=it.next();
		  String value=map.get(key);
		  System.out.println(key+ " : "+value);
		 }
		   System.out.println("-------------------");
		   System.out.println("HashMap After Replace");
			map.put("THREE", "ASEL");
			map.put("FIVE", "SUMAIR");
			Set<String> keysa=map.keySet();
			Iterator <String> its=keysa.iterator();
			while(its.hasNext()){
			  String key=its.next();
			  String value=map.get(key);
			  System.out.println(key+ " : "+value);
		}
	}
	}
