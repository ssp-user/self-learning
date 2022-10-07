package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class RepeaterInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] num =  {10,23,57,23,10,10,10,9,57,23,10,10,10,90,57};
		ArrayList<Integer> arrLst = new ArrayList<Integer>(); 
		HashSet<Integer> arrSt = new HashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			arrLst.add(num[i]);
			arrSt.add(num[i]);
		}
		for (Iterator iterator = arrSt.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println("Frequency of " + integer + " in the collection is " + Collections.frequency(arrLst, integer));
			
		}
	}

}
