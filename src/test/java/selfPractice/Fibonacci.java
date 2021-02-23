package selfPractice;

public class Fibonacci {
	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		System.out.println(i);
		System.out.println(j);
		for (int j2 = 0; j2 < 10; j2++) {
			int k = i + j;
			System.out.println(k);
			i = j;
			j = k;
		}
	}
}
