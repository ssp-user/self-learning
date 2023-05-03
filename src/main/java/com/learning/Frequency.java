package com.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {10,20,15,18,10,20,43,21,18,15,18,15};
		Set<Integer> intSet = new HashSet<Integer>();
		List<Integer> intList= new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			intList.add(arr[i]);
			intSet.add(arr[i]);
		}
		int size = intSet.size();
		for (Iterator iterator = intSet.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println("Frequency of " + integer + " in array is " + Collections.frequency(intList, integer));
			
		}
	}

}
