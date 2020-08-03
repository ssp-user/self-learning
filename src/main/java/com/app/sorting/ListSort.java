package com.app.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
	public static void main(String[] args) {
		// Unsorted list
		Integer[] arr = new Integer[] { 100, 20, 10, 30, 80, 70, 90, 40, 50, 60 };
		List<Integer> arrList = Arrays.asList(arr);
		// Sorting of list using the method
		Collections.sort(arrList);
		// Printing the list sorted above
		System.out.println(arrList);
	}
}