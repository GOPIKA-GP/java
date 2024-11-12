package Abstarction;

public class ChildClassOf1and2 implements InterfaceExample1,InterfaceExample2 {

	public void display1()
	{
		System.out.println("Show the interface example class 2 : "+A);
	}
	public void display2() 
	{
		System.out.println("Show the interface example classes 1 : "+B);
	}
	public static void main(String[] args) {
		
		ChildClassOf1and2 obj=new ChildClassOf1and2();
		obj.display1();
		obj.display2();
	}

}
