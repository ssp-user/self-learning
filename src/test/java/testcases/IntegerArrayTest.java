package testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class IntegerArrayTest {

	public static void main(String[] args) {
		Integer array1[] = {10,20,13,30,27,15,10};
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}		
		Integer array2[] = {30,40,12,27,20,227};
		ArrayList al1 = new ArrayList();
		Arrays.sort(array1);
		for (int i = 0; i < array1.length; i++) {
			System.out.println("****" +array1[i]);
		}	
		System.out.println("Trying Arrays binary search " +Arrays.binarySearch(array1, 10));		
		System.out.println("Trying Arrays binary search " +Arrays.binarySearch(array1, 9000));

	}
}
