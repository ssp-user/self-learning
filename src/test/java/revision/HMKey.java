package revision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HMKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> team = new HashMap<String, Integer>();
		team.put("United", 5);
		team.put("foo", 2);
		team.put("Shalu", 10);
		Set<String> teamKey = team.keySet();
		//teamKey = team.keySet();
		for (Iterator iterator = teamKey.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("Value of key is " + string);
		}
	}

}
