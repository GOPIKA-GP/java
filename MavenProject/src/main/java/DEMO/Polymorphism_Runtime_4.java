package DEMO;

public class Polymorphism_Runtime_4 extends Polymorphism_Runtime_3{
	public void m1()
	{
		super.m1();
		System.out.println("I AM COMMENT 4");
	} 

	public static void main(String[] args) {
		Polymorphism_Runtime_1 s;

		s=new Polymorphism_Runtime_2();
		s.m1();
		s=new Polymorphism_Runtime_3();
		s.m1();
		s=new Polymorphism_Runtime_4();
		s.m1();

	}

}
