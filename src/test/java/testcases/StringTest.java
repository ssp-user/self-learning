package testcases;


public class StringTest {

	public static void main(String[] args) {
		String name = "My name is Vishal Joshi";
		System.out.println("Original name is -->"+ name);
		String wordsInName[] = name.split(" ");
		String reverseName = "";
		for (int i = 0; i < wordsInName.length; i++) {
			System.out.print(wordsInName[i] + " ");
			reverseName = reverseName + reverseString(wordsInName[i]) + " ";
		}
		System.out.println();
		System.out.println(reverseName);
	}
	public static String reverseString(String originalString) {
		String reverseString = "";
		int i = originalString.length();
		while (i > (i)/2) {
			reverseString = reverseString + originalString.charAt(i-1);
			i--;
		}
		return reverseString;

	}

}
