package pattern;

import java.util.Scanner;

public class NumericRectAngularPattern {

public static void main(String args []) {
	
	Scanner sc=new Scanner(System.in );
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		
		for(int j=i;j<=n; j++) {
			System.out.print(j);
		}
		
		for(int j=1;j<=i-1;j++) {
			
			System.out.print(j);
		}
		System.out.println();
	}
		
		
		
		
		
		
		
		
//		12345
//		23451
//		34512
//		45123
//		51234
		
//		for(int i=1;i<=n;i++) {
//			
//			for(int j=1;j<=n;j++) {
//				System.out.print(j);                 //  123456      
//													//  123456
													//  123456
													//  123456
				} 
			
//			System.out.println();
	//}
	}

