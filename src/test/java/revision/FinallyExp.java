package revision;

public class FinallyExp {

	public static void main(String[] args) {
		try {
			int x = 1000;
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block executed");
		}
	}

}
