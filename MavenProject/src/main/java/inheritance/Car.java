package inheritance;

public class Car extends Vechicle {
	
	String brand="Hyundai";
	int price=600000;
	
	public void car() {
		System.out.println("The brand of the car is "+ brand);
		System.out.println("The price of the car is "+price);
	}
	 
	public static void main(String[] args) {
		Car obj=new Car();
		obj.car();
		obj.model();
		
	
		System.out.println(obj.name);

	}

}
