package SuperKeyword;

public class Class2 extends Class1
{
		String f = "Riya";
		
		public Class2()//invoke constructor parent class
		{
			super(); // for constructor first write the keyword
			System.out.println("India is my country");
			
		}
		
		public void display()
		{
			System.out.println("Invoke variable " + super.s);//invoke parent class variable
			
			System.out.println("Class 2 :"+ f);
		}
		
		public void display2()//invoke parent class method
		{
			super.display2();
			System.out.println("method 2 for super");
		}
public static void main(String[] args) 
{
	Class2 obj=new Class2();//constructor call
	obj.display();
	obj.display2();
}	
}