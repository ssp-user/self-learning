// Source - https://www.educba.com/sorting-in-java/?source=leftnav
package com.app.sorting;

import java.util.Arrays;
import java.util.Collections;

public class SimpleStringSort {
	public static void main(String[] args) {
		// Unsorted array of numbers
		String[] arr = new String[] { "Vishal", "Samanyu", "Joshi", "Vanad", "Suman" };
		// Sort function to sort the above array		
		Arrays.sort(arr);
		// Printing the sorted array on console
		System.out.println("Printing in ascending order " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		// Printing the sorted array on console
		System.out.println("Printing in descending order " + Arrays.toString(arr));
	}
}