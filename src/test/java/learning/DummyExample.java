package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class DummyExample {

	public static void main(String[] args) {
		Integer input[] = {12, 34, 45, 9, 8, 90, 3};
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		System.out.println("******Printing input ************ " + "\n");
		for (Integer integer : input) {
			System.out.print(integer + " ");
			if (integer % 2 == 0) {
				even.add(integer);
			} else {
				odd.add(integer);
			}
		}
		System.out.println("\n" + "Total even elements are " + even.size());
		System.out.println("Total odd elements are " + odd.size());		
		System.out.println("\n" + "Perform sorting");
		//Collections.sort(even, Collections.reverseOrder());
		//Collections.sort(odd, Collections.reverseOrder());		
		System.out.println("******Printing output ************ " + "\n");
		for (Iterator iterator = even.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");
		}
		for (Iterator iterator = odd.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");
		}		
		//Expected Output = {12, 34, 8, 90, 45, 9, 3}		

	}

}
