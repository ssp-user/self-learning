package testcases;

public class AnonymousClass {
	public void show() {
		System.out.println("***********Inside AC show**********");
	}

	public void tell() {
		System.out.println("***********Inside AC tell**********");
	}

	public static void main(String[] args) {
		AnonymousClass ac = new AnonymousClass(){
			public void show() {
				System.out.println("*********Inside overridden show********");
			}
			
		};
		ac.show();
		ac.tell();
	}

}
