package testcases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashTest {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(34);
		set.add(56);
		set.add(34);
		set.add(100);
		for (Integer integer : set) {
			System.out.println("Interger value is " + integer);
		}
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
	}

}
