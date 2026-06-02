package p1;

public class Demo3 {

	public static void main(String args []) {
		
		int perfum=499;
		int phone = 70000;
		int bike = 352000;
		
		double totalBill= perfum+phone+bike;
		
		double gst = totalBill * 0.18;
		
		totalBill = totalBill + gst;
		
		double discount;
		
		discount = totalBill > 50000?0.10:0.05;
		
		double discountPrice = totalBill*discount;
		
		double finalBill = totalBill - discountPrice;
		
		System.out.println("============Recipt=========");
		
		System.out.println("Total Bill : " +totalBill);
		System.out.println("gst: " +gst);
		System.out.println("Discount: " +discount);
		System.out.println("discountPrice: "+discountPrice);
		System.out.println("finalBill: "+finalBill);
	}
}
