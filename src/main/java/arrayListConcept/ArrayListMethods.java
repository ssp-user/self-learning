package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("javascript");
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("testing");
		ar2.add("java");		
		ar2.add("devops");
		//ar1.addAll(ar2);
		ar1.addAll(2, ar2);
		System.out.println(ar1);
		ar1.stream().forEach(ele->System.out.println(ele));
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		ar1.clear();
		System.out.println(ar1);
		ar1.stream().forEach(ele->System.out.println(ele));
		cloneList.stream().forEach(ele->System.out.println(ele));
		System.out.println(cloneList.contains("devops"));
		System.out.println(cloneList.containsAll(ar1));
		System.out.println(cloneList.indexOf("devops"));
		System.out.println(cloneList.lastIndexOf("java"));
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		number.stream().forEach(ele->System.out.println(ele));
		number.removeIf(vj -> vj%2 != 0);
		System.out.println("***********");
		number.stream().forEach(ele -> System.out.println(ele));
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Vishal","Joshi","Samanyu","Joshi"));
		System.out.println(namesList);
		namesList.retainAll(Collections.singleton("Joshi"));
		System.out.println(namesList);
		ArrayList<String> namesList2 = new ArrayList<String>(Arrays.asList("Vishal","Joshi","Samanyu","Vanad","Prasad"));
		System.out.println(namesList2);
		Object[] obj =   namesList2.toArray();
		for (Object string : obj) {
			System.out.println(string.toString());
		}
		namesList2.stream().forEach(ele -> System.out.println(ele));
		namesList2.subList(1, 4).stream().forEach(ele->System.out.println(ele));
	}

}

