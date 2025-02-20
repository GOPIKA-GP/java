package DEMO;

public class Encapsulation_1 {
	
	private String a;
	private int b;
	
	public void setter(String a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void getter()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
