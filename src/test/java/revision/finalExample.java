package revision;

public class finalExample {

	public static void main(String[] args) {
		int a = 1000; // if you write final int a = 1000; compiler will throw compilation error in next line.
		a = 500;
		System.out.println("Value of a is "+ a);

	}

}
