package testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class ArrayTest {

	public static void main(String[] args) {
		Integer arr1[] = {20,45,23,7,42,99,5,25,48,8,46,20,20,45};
		Integer arr2[] = {42,99,209,2,5,3,45,20,99};
		int len1 = arr1.length;
		int len2 = arr2.length;
		int length = len1 + len2;
		Integer arr3[] = new Integer [length];
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.print("First array element ");		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
			arr3[i] = arr1[i];			
		}
		System.out.println();
		System.out.print("Second array element ");			
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");			
			arr3[len1] = arr2[i];
			len1++;
		}
		System.out.println();
		System.out.print("Third array element ");
		Arrays.sort(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();	
		ArrayList al = new ArrayList();
		HashSet hs = new HashSet();
		for (int i = 0; i < arr3.length; i++) {
			al.add(arr3[i]);
			hs.add(arr3[i]);
		}
		System.out.println("*********");
		for (Object object : hs) {
			System.out.println("Frequency of "+ object + " in array is "+ Collections.frequency(al, object));
		}
		System.out.println("*********");		
		System.out.print("Third array element in descending order ");
		Arrays.sort(arr3, Collections.reverseOrder());
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}		
	}

}
