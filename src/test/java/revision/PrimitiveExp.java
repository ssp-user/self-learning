package revision;

public class PrimitiveExp {

	public static void main(String[] args) {
		int i = 10;
		Integer iRef = new Integer(i);
		int j = iRef.intValue();
		Integer kRef = i;

	}

}
