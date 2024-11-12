package ExceptionHandling;

public class ExampleOfThrow {
	public void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println("SUM = "+sum);
		if(sum>50)
		{
			throw new ArithmeticException("Sum is greater than 50");
		}
		else
		{
			System.out.println("Sum is less than 10");
		}
	}
	
	
	
	public static void main(String[] args) {
		ExampleOfThrow obj= new ExampleOfThrow();
		try
		{
		obj.sum(88, 7);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		
		System.out.println("Rest of the code");


	}}
