package inputBufferRederAndInputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferRederAndInputReder {
public static void main(String args []) throws NumberFormatException, IOException {
	
	System.out.println("Enter Num");
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader bf=new BufferedReader(in);
	
	
	int num = Integer.parseInt(bf.readLine());
	System.out.println(num);
	
System.out.println("Enter Second Num");
	int num1=Integer.parseInt(bf.readLine());
	System.out.println(num1+num);
	
	bf.close();
}
}
