package threads;
 class R implements Runnable{
	public void run() {
		System.out.println("Run");
	}
}

class O implements Runnable{
	public void run() {
		System.out.println("Runnable ");
	}
}
public class RunnableClass {
public static void main(String args []) {
	
	Runnable obj=new R();
	Runnable obj1=new O();
	
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj1);
	
	t1.start();
	t2.start();
	
	
}
}
