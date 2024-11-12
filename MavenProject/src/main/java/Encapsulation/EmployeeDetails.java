package Encapsulation;

public class EmployeeDetails {

	
	
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setName("GOUTHAM DAS");
		obj.setAccnum(66336);
		obj.setMailid("abc.hdb@gmail.com");
		
			System.out.println("Employee name :"+obj.getName());
			System.out.println("Account no :"+obj.getAccnum());
			System.out.println("mail id :"+obj.getMailid());
		
	}

}
