package DEMO;

public class Polymorphism_Compiletime_2 extends Polymorphism_Compiletime_1 {
	
	public void sum(int x2,int y2)
	{
		int a=x2+y2;
		System.out.println("Sum of Child class = "+ a);
		super.sum(4, 5);
	}

	public static void main(String[] args) {
		
		Polymorphism_Compiletime_2 obj=new Polymorphism_Compiletime_2();
		obj.sum(10, 20);

	}

}
