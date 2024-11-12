package Encapsulation;

public class Class1 {
	
	private String a;
	private int b;
	private String c;
	
	public void setter(String a,int b,String c) //setter  name should not change
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
    public void getter() //getter name should not change
    {
    	System.out.println("Name : "+a);
    	System.out.println("Age : "+b);
    	System.out.println("Place : "+c);
    	
    }
}
