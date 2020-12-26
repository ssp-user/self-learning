package testExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLapTop {

	public static void main(String[] args) {
		Laptop acer = new Laptop("ACER",35000,4);
		Laptop hp = new Laptop("HP",37500,80);
		Laptop mac = new Laptop("MAC",65000,16);
		List<Laptop> lst = new ArrayList<Laptop>();
		lst.add(hp);		
		lst.add(acer);
		lst.add(mac);
		for (Laptop laptop : lst) {
			System.out.println(laptop.getBrand() + " "+laptop.getPrice() + " "+laptop.getRam());
		}
		Collections.sort(lst, new Comparator<Laptop>() {
			public int compare(Laptop o1, Laptop o2) {
				if (o1.getBrand().length() < o2.getBrand().length())
					return 1;
				return -1;
			}
		});
		for (Laptop laptop : lst) {
			System.out.println(laptop.getBrand() + " "+laptop.getPrice() + " "+laptop.getRam());
		}		
	}

}
