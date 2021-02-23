package selfPractice;

public class FibonacciRecursion {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		printSeries(0, 1);
	}
	public static void printSeries(int i, int j) {

		int k = i + j;
		System.out.println(k);		
		i = j;
		j = k;
		if (i > 1000) {
			return;
		}
		printSeries(i, j);
	}	
}
