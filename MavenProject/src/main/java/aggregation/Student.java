package aggregation;

public class Student {
	String name;
	int age;
	Address adr;//refernce variable as adr.adr-any name
	
	public Student(String name,int age,Address adr)//add Address adr also as parameter
	{
		this.name=name;
		this.age=age;
		this.adr=adr; //parameter
	}
	public void display()
	{
		System.out.println("Student name : "+name);
		System.out.println("Student age : "+age);
		System.out.println("House Name : "+adr.houseName);
		System.out.println("House no : "+adr.houseNo);
		System.out.println("Place : "+adr.place);
		System.out.println("Pincode : "+adr.pincode);
		
	}

	public static void main(String[] args) {
		
		Address obj1=new Address("GJHBHJU",2424,"dbjhdb",5436);
		Student obj2=new Student("Arjunan",18,obj1);//passing the obj1-all details stored in obj1 is displayed 
		obj2.display();

	}

}
