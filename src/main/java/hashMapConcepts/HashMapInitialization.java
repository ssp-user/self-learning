package hashMapConcepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.mongodb.connection.Stream;

public class HashMapInitialization {

	public static void main(String[] args) {
		//Immutable map
		Map<String, Integer> map3 = Collections.singletonMap("VJ", 200);
		map3.forEach((k,v)-> System.out.println(k + "  " + v));
	}

}
