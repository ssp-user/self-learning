package puzzles_medium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Sub_array_A {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "2");
		map.put("21", "3");
		map.put("1", "5");
		map.put("21", "21");		
		for (Map.Entry<String,String> entry : map.entrySet())  
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
	}
}
