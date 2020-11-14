package testcases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class StringCountTest {

	public static void main(String[] args) {
		String strArray[] = {"Vishal", "Vanad", "Vanad", "Samanyu", "Joshi", "Vishal", "Vanad", "Vanad", "Joshi", "Vanad"};
		ArrayList al = new ArrayList();
		HashSet hs = new HashSet();
		for (int i = 0; i < strArray.length; i++) {
			al.add(strArray[i]);
			hs.add(strArray[i]);
		}
		for (Object object : hs) {
			System.out.println("Frequency of "+ object + " in array is --> "+Collections.frequency(al, object));
		}
		
		
		for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println("***Frequency of "+ object + " in array is --> "+Collections.frequency(al, object));			
		}

	}

}
