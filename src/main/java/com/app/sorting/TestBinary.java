package com.app.sorting;

public class TestBinary {

	public static void main(String[] args) {
		int i = 127;
		String binaryString = Integer.toBinaryString(i);
		String octalString = Integer.toHexString(i);
		System.out.println(binaryString);
		System.out.println(octalString);		
		int decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal);

	}

}
