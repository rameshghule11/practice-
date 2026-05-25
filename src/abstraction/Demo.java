package abstraction;
abstract class Animal{
	
	abstract void sound();
}

class Dog extends Animal{
	void sound() {
		System.out.println("Dog is BHOW bHOw");
	}
}
public class Demo {
	public static void main(String args []) {
	Dog d=new Dog();
	
	d.sound();
	
	}
}
