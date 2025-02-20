package DEMO;

public class SingleInheritance2 extends SingleInheritance1{
	
	int Salary=45000;
	
	public void salarydetails()
	{
		System.out.println("Salary :"+Salary);
	}

	public static void main(String[] args) {
		
		SingleInheritance2 obj=new SingleInheritance2();
		obj.employeedeatils();
		obj.salarydetails();
		
		

	}

}
