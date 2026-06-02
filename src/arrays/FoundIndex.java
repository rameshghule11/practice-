package arrays;

class Found{
	void foundIndexOfX() {
	
		int [] arr = {12,54,64,23,78,5,9,454,1,4,656,54,484};
		int x=454;
		int ans= -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				ans=i;
				break;
			}
			
			
		}
		System.out.println("X IS: "+ x + "  IndexOF X: " +ans);
		
		
	}
}
public class FoundIndex {
public static void main(String args []) {
	
	Found f=new Found();
	f.foundIndexOfX();
}
}
