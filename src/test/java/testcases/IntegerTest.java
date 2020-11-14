package testcases;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class IntegerTest {

	public static void main(String[] args) {
		int ar[] = {1, 2, 3, 1, 2, 3, 4 ,4,5,6,7,3,4,5,1,1,2,3};
		ArrayList al = new ArrayList();
		HashSet hs = new HashSet();
		for (int i = 0; i < ar.length; i++) {
			al.add(i, ar[i]);
			hs.add(ar[i]);
		}
		
		for (Object object : hs) {
			System.out.println("Frequency of " + object + " is--> "+Collections.frequency(al, object));
		}
		int freq = Collections.frequency(al, 1);
		System.out.println(freq);
		
		/*Integer arr[] = {1, 2, 3, 1, 2, 3, 4 ,4,5,6,7,3,4,5};
		int freq = Collections.frequency(Arrays.asList(arr), 5);
		System.out.println(freq);*/

	}
}
