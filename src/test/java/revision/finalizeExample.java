package revision;

public class finalizeExample {
	
	public void finalize() {
		System.out.println("Finalize is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalizeExample f1 = new finalizeExample();
		finalizeExample f2 = new finalizeExample();
		f1 = null;
		//f2 = null;
		System.gc();
	}

}
