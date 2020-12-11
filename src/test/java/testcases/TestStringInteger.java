package testcases;

public class TestStringInteger {

	public static void main(String[] args) throws InterruptedException {
		String str = "4242424242424242";
		for (int i = 0; i < str.length(); i++) {
			System.out.print("Value of String is "+ str.charAt(i));
			System.out.println(" Integer Value is "+Integer.parseInt(Character.toString(str.charAt(i))));
			Thread.sleep(1000);
		}
//		System.out.println(Integer.parseInt(str));
	}

}
