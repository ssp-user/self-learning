package testcases;

public class Testclass {
	public static void main(String[] args) {
		String str = "My Name is Vishal Joshi";
		String[] split = str.split(" ");
		System.out.println("Original String is " + str);
		String reverseString = "";
		for (int i = 0; i < split.length; i++) {
			reverseString = reverseString + reverse(split[i]) + " ";
		}
		System.out.println("Reverse String is " + reverseString);
	}

	public static String reverse(String originalString) {
		String reverseChar = "";
		int i = originalString.length();
		while (i > (i/2)) {
			reverseChar = reverseChar + originalString.charAt(i-1);
			i--;
		}
		return reverseChar;
	}
}
