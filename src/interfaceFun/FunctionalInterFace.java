package interfaceFun;

@FunctionalInterface // This is a Annotation we are not use this the we are create multiple methods in Interface 
interface A{
	void show();
}

public class FunctionalInterFace {
public static void main(String args []) {
	
	A obj=new A()
			{
		public void show() {
			System.out.println("Functional Interface In Java");
		}
			};
			obj.show();
}
}
