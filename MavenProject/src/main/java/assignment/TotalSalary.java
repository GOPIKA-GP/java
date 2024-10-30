package assignment;

public class TotalSalary extends Allowances {

	double total;
 public void totalsal()
{
	
	total=basic+hra+bonus-pf-deduction;
	System.out.println("Total sarlary : "+total);
}
	public static void main(String[] args) {
		
		TotalSalary obj=new TotalSalary();
		obj.basic();
		obj.display2();
		obj.totalsal();
	}

}
