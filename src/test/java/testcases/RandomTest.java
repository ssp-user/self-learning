package testcases;

@FunctionalInterface
interface Parent {
	public void show();	
}

public class RandomTest {

	public static void main(String[] args) {
		Parent p = () -> System.out.println("Inside one line");
		p.show();
	}

}
