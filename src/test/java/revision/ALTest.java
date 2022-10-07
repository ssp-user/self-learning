package revision;

import java.util.ArrayList;
import java.util.Iterator;

public class ALTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alStr = new ArrayList<String>();
		alStr.add("Vishal");
		alStr.add("Joshi");
		alStr.add("Task");
		for (Iterator iterator = alStr.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		for (int i = 0; i < alStr.size(); i++) {
			System.out.println("Element " + i + " is " + alStr.get(i));
		}
	}

}
