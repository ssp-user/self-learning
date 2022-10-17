package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,10,15,25,20,18));
		System.out.println("initial list "+ list);
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		System.out.println("ArrayList with duplicates removed: " + newList);
	}

}
