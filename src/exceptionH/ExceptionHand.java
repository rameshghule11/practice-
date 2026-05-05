package exceptionH;

public class ExceptionHand {
	public static void main(String args[]) {

		int i = 4;
		int j = 0;

		int nums[] = new int[5];
		

		

		try {
			j = 18 / i;
			
			System.out.println(nums[1]);
			System.out.println(nums[5]);
		}

		catch ( ArithmeticException e) {
			System.out.println("Cannot Divided by zero ");
		}
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Stay  your Limit ");
		}
		
		System.out.println(j);
	}
}
