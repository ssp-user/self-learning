package arrayListConcept;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("javascript");
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("testing");
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
		
		
	}

}
