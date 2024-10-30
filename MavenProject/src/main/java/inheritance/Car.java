package inheritance;

public class Car extends Vechicle {
	
	String brand="Hyundai";
	int price=600000;
	
	public void car() {
		System.out.println("The brand of the car is"+ brand);
	}
	 
	public static void main(String[] args) {
		Car obj=new Car();
		obj.model();
		obj.car();

		System.out.println(obj.name);

	}

}
