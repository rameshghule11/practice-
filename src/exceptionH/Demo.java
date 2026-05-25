package exceptionH;

class A {
	public void show() {
		try {
			Class.forName("Demo");
		} catch (ClassNotFoundException e) {
			System.out.println("Not able to find class");
		}

	}
}

public class Demo {

	static {
		System.out.println("Class Loder");
	}

	public static void main(String args[]) {

		A obj = new A();
		obj.show();
	}
}
