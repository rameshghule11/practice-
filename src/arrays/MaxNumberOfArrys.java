package arrays;

class MaxArray {

	void maxArray() {
		
		int [] arr= {14,12,54,75,65,48};
		int ans =0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>ans) {
				ans=arr[i];
			}
		}
		System.out.println("MaxNo: " +ans);

	}

}

public class MaxNumberOfArrys {

	public static void main(String args[]) {

		MaxArray m=new MaxArray();
		m.maxArray();
	}

}
