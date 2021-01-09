package hashSetConcepts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new LinkedHashSet<String>();
		hs.add("Alpha");
		hs.add("VJ");
		hs.add("Peter");
		hs.add("Local");
		System.out.println(hs);
	}

}
