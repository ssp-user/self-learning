package testExamples;

import java.util.Comparator;

public class sortLogic implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1%100 > o2%100)
			return 1;
		return -1;
	}

}
