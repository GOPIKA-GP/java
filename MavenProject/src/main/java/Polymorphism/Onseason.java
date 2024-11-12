package Polymorphism;

public class Onseason extends Offseason {
	static double discounts = 0.40;

	public void discound(double cost) {
		 System.out.println("ONSEASON PURCHASE - DISCOUNDS ");
		 System.out.println("Rate of the items = "+ cost);
		 System.out.println("Onseason discound(@ 40 %) = "+ cost*discounts);
		 System.out.println("Total Price (after all discound) = "+ (cost-(cost*discounts)));
		 System.out.println("");
	        super.discound(8000);
	}

	public static void main(String[] args) {
		
		Onseason obj1=new Onseason();
		obj1.discound(8000);
		
	}

}
