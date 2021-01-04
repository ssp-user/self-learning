package arrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList <Object> ar = new ArrayList<Object>();
		ar.add(true);
		ar.add("Testing");
		ar.add(12.34);
		System.out.println(ar.get(0));
		System.out.println(ar.get(2));
		System.out.println("Sizer of arr list is " +ar.size());
		ar.add("new element");
		ar.add(4.56);
		System.out.println("Sizer of arr list is " +ar.size());
	}

}
