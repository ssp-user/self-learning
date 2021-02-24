package testString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TestInteger {

	public static void main(String[] args) {
		Integer abc[] = {10,20,34,25,10,27,83,25,34,34,20,20,100,20,83};
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < abc.length; i++) {
			al.add(abc[i]);
			hs.add(abc[i]);
		}
		for (Integer integer : hs) {
			System.out.println("Count of " + integer + " in array is "+ Collections.frequency(al, integer));
		}
	}

}
