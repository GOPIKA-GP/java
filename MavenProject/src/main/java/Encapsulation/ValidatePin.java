package Encapsulation;

public class ValidatePin {

	public static void main(String[] args) {
		UserAcc obj=new UserAcc();
		obj.setPin(1001);
		System.out.println("ENTER THE PIN : "+obj.getPin());
		obj.display();
		

	}

}
