package puzzles_medium;

import java.util.HashMap;
import java.util.Map;

public class Sub_array_B {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("VJ", 1);
		map.put("kJ", 78);
		map.put("oJ", 3);		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
