package Abstarction;

public class HDFC implements RBI {
	
	float intial_amount=25000;
	int duration_month=12;
	
	public void  recurringDeposit() 
	{
		float amt=INTREST_RATE*intial_amount;
		
	    System.out.println("Intrest Received : "+amt);
	    System.out.println("Final amount recived : "+(amt+intial_amount));
	}
	public void print() {
		System.out.println("Amount deposited : "+intial_amount);
		System.out.println("Duration(in months) : "+duration_month);
		
		
	}
	public static void main(String[] args) {
		RBI obj=new HDFC();
		obj.print();
		obj.recurringDeposit();
		
	}

}
