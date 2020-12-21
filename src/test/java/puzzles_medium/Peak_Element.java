package puzzles_medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Peak_Element {

	public static void main(String[] args) {
		Integer arr[] = {8,9,10,2,5,6};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);
		}
		
		Set<Entry<Integer, Integer>> s = map.entrySet();
		for (Entry<Integer, Integer> ent : s) {
			System.out.println(ent.getKey() + "  " + ent.getValue());
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

}
