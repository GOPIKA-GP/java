package Abstarction;

public class FullTimeEmployee extends Employee {
	
	public void calculateSalary(int Perhour,int Workinghours) {
		int Totalworking=Perhour*Workinghours;
        System.out.println("Total pay for Full time employee :"+Totalworking);
		
	}

	public static void main(String[] args) {
		
		Employee obj1=new FullTimeEmployee();
		Employee obj2=new Contractor();
		obj1.calculateSalary(8, 1000);
		obj2.calculateSalary(4, 900);

	}

}
