package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SortExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] num =  {10,23,57,23,10,10,10,9,57,23,10,10,10,90,57};
		ArrayList<Integer> arrLst = new ArrayList<Integer>(); 
		for (int i = 0; i < num.length; i++) {
			arrLst.add(num[i]);
			// System.out.println("Array list element at index "+ i + "is " + arrLst.get(i));
		}		
		System.out.println("Array List is " + arrLst);
		Collections.sort(arrLst);
		System.out.println("Array List is " + arrLst);
		Collections.sort(arrLst, Collections.reverseOrder());
		System.out.println("Array List is " + arrLst);
	}

}
