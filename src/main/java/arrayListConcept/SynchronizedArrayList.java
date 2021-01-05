package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		List <String> namesList =  Collections.synchronizedList(new ArrayList<String>(Arrays.asList("Java","Python","Ruby")));
		
		synchronized (namesList) {
			namesList.stream().forEach(ele ->System.out.println(ele));
		}
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>(Arrays.asList("JavaJ","Python","Ruby"));
		empList.add("Joshi");
		empList.stream().forEach(ele -> System.out.println(ele));
		

	}

}
