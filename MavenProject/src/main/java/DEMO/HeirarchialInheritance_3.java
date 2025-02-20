package DEMO;

public class HeirarchialInheritance_3 extends HeirarchialInheritance_1{
	String name2="Gokhila P";
	public void housename2()
	{
		System.out.println("Second born girl name : "+name2);
	}
	public static void main(String[] args) {
		
		HeirarchialInheritance_3 obj1=new HeirarchialInheritance_3();
		obj1.housename();
		obj1.housename2();
		
		HeirarchialInheritance_2 obj2=new HeirarchialInheritance_2();
		obj2.housename();
		obj2.housename1();
		
		

	}

}
