package practicse;
import java.util.Scanner;


public class FindFirstAndLastDigit {
	
	static int getFirstDigit(int num) {
		while(num>9) {
			num=num/10;
		}
		return num;
		
		
	}
	
	static int  getLastDigit(int num) {
		return num%10;
	}

	public static void main(String args []) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=sc.nextInt();
		
		int firstDigit=getFirstDigit(num);
		int lastDigit=getLastDigit(num);
		
		System.out.println("First Digit: "+firstDigit);
		System.out.println("Last Digit: "+lastDigit);
		
		
		
	}
}
