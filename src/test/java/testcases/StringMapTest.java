package testcases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringMapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("VJ", "SJ");
		map.put("UI", "RTI");
		map.put("II", "UY");
		Set<Entry<String, String>> entry = map.entrySet();
		for (Iterator iterator = entry.iterator(); iterator.hasNext();) {
			Entry<String, String> entry2 = (Entry<String, String>) iterator.next();
			System.out.println(entry2.getKey() + "    " + entry2.getValue());
		}
		for (Map.Entry<String, String> entry3 : map.entrySet()) {
			System.out.println("Key is "+ entry3.getKey() + " Value is  "+entry3.getValue());
		}
	}

}
