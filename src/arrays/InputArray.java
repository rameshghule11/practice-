package arrays;

import java.util.Scanner;

public class InputArray {
	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int n=sc.nextInt();
		
		int arr[]=new int [n];
		
		System.out.println("Enter Array " +n + " elements");
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("OutPut: "+arr[i]);
		}
	}
}
