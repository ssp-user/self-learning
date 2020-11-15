package testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class FloatTest {

	public static void main(String[] args) {
		Double fltArray[] = {1.23,3.21,5.67,1.22,7.65,3.23,1.23,3.21,7.65,3.21};
		ArrayList al = new ArrayList();
		HashSet hs = new HashSet();
		for (int i = 0; i < fltArray.length; i++) {
			al.add(i, fltArray[i]);
			hs.add(fltArray[i]);
		}
		for (Object object : hs) {
			System.out.println("Frequency of "+ object + " is -->"+Collections.frequency(al, object));
		}
		Arrays.sort(fltArray);
		for (int i = 0; i < fltArray.length; i++) {
			System.out.println(fltArray[i]);
		}
		System.out.println("Find "+ Arrays.binarySearch(fltArray, 7.65));
	}

}
