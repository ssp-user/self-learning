package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<String> marksList = new ArrayList<String>();
		marksList.add("Tom");
		marksList.add("Naveen");
		marksList.add("Tom");
		marksList.add("Naveen");
		for (String string : marksList) {
			System.out.println(string);
		}
		System.out.println("_________");
		marksList.stream().forEach(ele->System.out.println(ele));
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		numbers.stream().forEach(ele->System.out.println(ele));
		
		ArrayList<String> languages = new ArrayList<String>(Arrays.asList("Hindi","English","Gharwali","Kumanoni"));
		languages.stream().forEach(ele->System.out.println(ele));
	}

}
