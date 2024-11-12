package Abstarction;

public class AbstractClass2 extends AbstractClass1{
	
	public void display() 
	{
		System.out.println("Encapsulation given in the Parent Class");
	}
	
	public void show()
	{
		System.out.println("Print in the child class");
	}

	public static void main(String[] args) {
		AbstractClass2 obj=new AbstractClass2();
		obj.print();
		obj.display();
		obj.show();
		
	}

}
