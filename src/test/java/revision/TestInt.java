package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {10,20,2,10,25,8,2,20,20,25,100,15,8,10,20,2,10,25,8,2,20,20,25,100,15,8,100};
		HashSet<Integer> aSet = new HashSet<Integer>();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			aSet.add(a[i]);
			aList.add(a[i]);
		} 
		for (Iterator iterator = aSet.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println("Frequency of " + integer + " in the array is "+ Collections.frequency(aList, integer));
		}
	}

}
