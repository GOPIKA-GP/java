package ExceptionHandling;

public class LicenceExeption2 {
	
	public void display(int age) throws LicenceException
	{
		if(age>18)
		{
			System.out.println("Age is greater than 18");
		}
		else
		{
		throw new LicenceException("age is less than 18");
		}
	}

	public static void main(String[] args) {
		LicenceExeption2 obj=new LicenceExeption2();
				try {
					obj.display(10);
				} catch (LicenceException e) {
					
					e.printStackTrace();
				}

	}

}
