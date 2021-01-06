package hashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		//capitalMap.put(null, "Kabul");
		capitalMap.put("Afganistan", "Karachi");
		capitalMap.put("Pakistan", "Karachi");		
		//System.out.println(capitalMap.get("Kenya"));
		//System.out.println(capitalMap.get(null));	
		Iterator<String> itr = capitalMap.keySet().iterator();
		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println("Key: "+ key + " Value: "+ capitalMap.get(key));
		}
		System.out.println("***********");
		Iterator<Entry<String, String>> ir = capitalMap.entrySet().iterator();
		while (ir.hasNext()) {
			Entry<String, String> entry = ir.next();
			System.out.println("Key: "+ entry.getKey() + " Value: "+ entry.getValue());
		}
		System.out.println("***********");
		for (Map.Entry<String, String> entry : capitalMap.entrySet()) {
			System.out.println("Key: "+ entry.getKey() + " Value: "+ entry.getValue());
		}
		System.out.println("*****Java 8******");		
		capitalMap.forEach((k,v)->System.out.println("Key: "+ k + " Value: "+ v));

	}
}
