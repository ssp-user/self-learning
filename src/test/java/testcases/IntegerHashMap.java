package testcases;

import java.util.HashMap;
import java.util.Map;

public class IntegerHashMap {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 45);
		map.put(34, 5);
		map.put(1, 56);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("key is " + entry.getKey() + " Value is "+entry.getValue());
		}

	}

}
