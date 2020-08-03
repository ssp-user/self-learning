//Source - https://www.educba.com/sorting-in-java/?source=leftnav
package com.app.sorting;

import java.util.Arrays;
import java.util.Collections;

public class SimpleIntegerSort {
	public static void main(String[] args) {
		// Unsorted array of numbers
		Integer[] arr = new Integer[] { 100, 20, 10, 30, 80, 70, 90, 40, 50, 60 };
		// Sort function to sort the above array		
		Arrays.sort(arr);
		// Printing the sorted array on console
		System.out.println("Printing in ascending order " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		// Printing the sorted array on console
		System.out.println("Printing in descending order " + Arrays.toString(arr));		
		Arrays.sort(arr, 1, 5);
		//Printing the sorted array on console
		System.out.println("Printing subset of elements " + Arrays.toString(arr));
	}
}