package com.app.sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashKey {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(80, "Akshay");
		map.put(20, "Akash");
		map.put(10, "Bob");
		map.put(30, "Nitika");
		map.put(90, "Yashi");
		map.put(100, "Dragisa");
		System.out.println(map);		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(map);
		System.out.println(treeMap);
	}
}