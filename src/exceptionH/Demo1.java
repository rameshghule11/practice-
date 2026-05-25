package exceptionH;

public class Demo1 {

	public static void main(String args[]) {

		int i=0;
		int j=0;
		try {

			j=18/i;
		}catch(Exception e) {
			
			System.out.println("SomeThing Went Wrong .");
		}
		
		finally {
			
			System.out.println("Bye");
		}
	}
}
