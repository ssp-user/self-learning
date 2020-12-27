package comparableExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparableExamples.Laptop;

public class Runner {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("ACER",35000,4));
		laps.add(new Laptop("HP",37500,80));		
		laps.add(new Laptop("MAC",65000,16));	
		Collections.sort(laps);
		for (Laptop laptop : laps) {
			System.out.println(laptop);
		}
	}

}
