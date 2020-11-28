package testcases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IntegerMapTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "SJ");
		map.put(34, "RTI");
		map.put(75, "UY");
		map.put(75, "UYiu");		
		for (Map.Entry<Integer, String> vj : map.entrySet()) {
			System.out.println("Key is "+ vj.getKey() + " Value is "+vj.getValue());
		}
	}

}
