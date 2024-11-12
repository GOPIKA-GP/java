package ExceptionHandling;

public class TryAndCatch {
	
	
	

	public static void main(String[] args) {
		int a=5,b=10;
		int sum=a+b;
		
		
		try         //to do exemption
		{
			int div=a/0;
			int arr[]=new int[5];
			arr[7]=34;
		}
		catch(ArithmeticException r)
		{
			System.out.println("Division by 0 is not possible");
		}
		catch(ArrayIndexOutOfBoundsException r)
		{
			System.out.println("Array length is 5");
		}
		catch(Exception r)
		{
		
			System.out.println("Parent exception");
		}
		/*finally
		{
			System.out.println("finally block will work if there is an exemption and is not handled i.e only try keyword is used");
		}
		*/
			System.out.println("SUM OF THE NUMBERS = "+sum);
		   
			System.out.println("rest of the codes");
	}

}
