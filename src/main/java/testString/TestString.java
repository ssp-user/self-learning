package testString;

import java.util.ArrayList;
import java.util.Collections;

public class TestString {

	public static void main(String[] args) {
		String [] str = {"cat", "dog", "tac", "god", "act"};
		int[] index = new int[str.length];
		String [] words = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			index[i] = i;
			words[i] = str[i];
		}
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

}
