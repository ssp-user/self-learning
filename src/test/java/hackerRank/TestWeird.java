package hackerRank;

import java.util.Scanner;

public class TestWeird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = num%2;
		if (rem != 0) {
			System.out.println("Weird");
		} else {
			if (rem == 0 && (num >=2 && num <=5)) {
				System.out.println("Not Weird");
			}
			if (rem == 0 && (num >=6 && num <=20)) {
				System.out.println("Weird");
			}
			if (rem == 0 && num >20) {
				System.out.println("Not Weird");
			}			
		}	
	}

}
