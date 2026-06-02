package arrays;

public class Demo1 {
public static void main(String args []) {
	
	int age[][]=new int[2] [3];
	
	
	age[0][0]=10;
	age [0][1]=20;
	age [0][2]=21;
	
	age[1][0]=11;
	age [1][1]=22;
	age [1][2]=23;
	
	
	
	
	
	for(int i=0;i<=age.length-1;i++) {
		
		for(int j=0;j<age[i].length; j++) {
		System.out.println("age "+ age[i][j]);
		
		}
		
	}
	
	
}
}
