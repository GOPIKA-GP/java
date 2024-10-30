package inheritance;

public class Tester extends Employer {
	
String name2="Vivek";
public void employee2()
{
	System.out.println("Tester name :"+name2);
}

	public static void main(String[] args) {
		Tester obj=new Tester();
		obj.emp();
		obj.employee2();
	Developer obj2=new Developer();
	obj2.employee1();
	obj2.emp();
     
	}

}
