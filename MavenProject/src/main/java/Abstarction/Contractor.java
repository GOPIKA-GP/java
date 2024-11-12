package Abstarction;

public class Contractor extends Employee{
	public void calculateSalary(int Perhour,int Workinghours) {
		int Totalworking=Perhour*Workinghours;
        System.out.println("Total pay for contractors :"+Totalworking);
		
	}

	

}
