package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Vishal", "Joshi", "Samanyu", "Peter", "Vanad", "Joshi", "Joshi", "Vanad", "Joshi", "Joshi"};
		HashSet<String> strSet = new HashSet<String>();
		ArrayList<String> strAL = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			strSet.add(str[i]);
			strAL.add(str[i]);
		}
		for (Iterator iterator = strSet.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("Frequency of " + string + " in array is " + Collections.frequency(strAL, string));
		}
		for (Iterator iterator = strAL.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("String element -->>>>>> "+ string);
		}
		System.out.println("Now sort the list");
		Collections.sort(strAL);
		for (Iterator iterator = strAL.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("String element -->>>>>> "+ string);
		}
		System.out.println("Now sort the list in reverse order");
		Collections.sort(strAL, Collections.reverseOrder());
		for (Iterator iterator = strAL.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("String element -->>>>>> "+ string);
		}
	}

}
