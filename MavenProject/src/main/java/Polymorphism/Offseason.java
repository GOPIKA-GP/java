package Polymorphism;

public class Offseason {
	  static double discounts = 0.15;

	public void discound(double cost) {
		System.out.println("OFFSEASON PURCHASE - DISCOUNDS ");
		System.out.println("Rate of the items = "+ cost);
		 System.out.println("Onseason discound(@ 15 %) = "+ cost*discounts);
		 System.out.println("Total Price (after all discound) = "+ (cost-(cost*discounts)));
	}
}
