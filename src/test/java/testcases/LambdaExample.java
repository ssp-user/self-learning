package testcases;

public class LambdaExample {
	public static void main(String[] args) {
		ParentLambda pl = () -> System.out.println("Lambda implementation");
		pl.show();
	}
}

@FunctionalInterface
interface ParentLambda {
	public void show();
}
