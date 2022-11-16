package revision;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] =  {7, 19, 2334, 12, 165};
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1)
				break;
			if (a[i] < a[i+1]) {
				temp = a[i + 1];
			}
		}
		System.out.println("Temp value is "+ temp);
	}

}
