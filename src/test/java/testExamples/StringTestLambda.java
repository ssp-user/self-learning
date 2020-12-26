package testExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringTestLambda {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("Vishal");
		lst.add("Joshi");
		lst.add("PrithuPranshu");
		lst.add("PrabhuKumarPrashad");
		lst.add("Akhilesh Joshi");
//		Collections.sort(lst);//default sorting in increasing order
//		Collections.sort(lst,Collections.reverseOrder());//sorting in reverse order
		Collections.sort(lst,(str1,str2)-> {
				if (str1.length() > str2.length())
					return 0;
				return -1;
		});
		for (String string : lst) {
			System.out.println(string);
		}

	}

}
