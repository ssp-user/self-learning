package arrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>(20);
		System.out.println("Size of array list is "+ ar.size());
		ar.add(100);
		System.out.println("Size of array list is "+ ar.size());
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println("Size of array list is "+ ar.size());		
	}
}
