package Polymorphism;

public class class2 extends class1 {
	public void add(int c,int d)
	{
		int x=c+d;
		System.out.println("Child class sum = "+ x);
		super.add(2,4);//calling parent class method
	}

	public static void main(String[] args) {
		
		class2 obj1=new class2();//upcasting
		obj1.add(2, 5);
		
		//class1 obj=new class1();
		//obj.add(2, 5);
		
		

	}

}
