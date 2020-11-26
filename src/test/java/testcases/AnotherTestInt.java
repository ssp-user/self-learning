/**
 * 
 */
package testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author VISHAL
 *
 */
public class AnotherTestInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer [] array = {10,20,30,10,20,40,1,15,17,10};
		HashSet hs = new HashSet();
		ArrayList al = new ArrayList();
		for (int i = 0; i < array.length; i++) {
			hs.add(array[i]);
			al.add(array[i]);
		}
		for (Object object : hs) {
			System.out.println("Frequency of "+ object + " in array is-->"+Collections.frequency(al, object));
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element "+ i + " is "+array[i]);
		}
		System.out.println("Index of " + Arrays.binarySearch(array, 20));
	}

}
