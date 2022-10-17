package revision;

class Parent
{
	public static void foo() {System.out.println("I am foo in Super");}
	public void bar() {System.out.println("I am bar in Super");}
}

public class Child extends Parent{
	public static void foo() {System.out.println("I am foo in Child");}
	public void bar() {System.out.println("I am bar in Child");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent par = new Child();
		Child child = new Child();
		par.foo();
		child.foo();
		
		par.bar();
		child.bar();
	}

}
