package Encapsulation;

public class UserAcc {
	
	private int pin;


	public int getPin() {
		return pin;
		
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void display()
	{
	if(pin==1001||pin==1234||pin==1212) 
	{
		System.out.println("PIN IS VALID");
	}
	else
	{
		System.out.println("INVALID PIN");
	}
	}
	

}
