package arrayListConcept;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,60,3,5,6,2,7));
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		System.out.println(linkedHashSet);
		linkedHashSet.stream().forEach(ele -> System.out.println(ele));
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,60,3,5,6,2,7));	
		List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
	}

}
