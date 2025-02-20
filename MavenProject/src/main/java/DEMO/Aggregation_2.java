package DEMO;

public class Aggregation_2 {
	
	String qualification;
	String job;
	int year;
	Aggregation_1 adr;
	
	public Aggregation_2(Aggregation_1 adr,String qualification,String job,int year)
	{
		this.adr=adr;
		this.qualification=qualification;
		this.job=job;
		this.year=year;
	}
	public void display()
	{
		System.out.println("My name is "+adr.name);
		System.out.println("I am at the age of "+adr.age);
		System.out.println("I belongs to "+adr.place);
		System.out.println("My qualification is  "+qualification);
		System.out.println("Currently i am working as  "+job);
		System.out.println("In this year "+year);
	}

	public static void main(String[] args) {
		Aggregation_1 obj1=new Aggregation_1("Gopika G P",31,"TVM");
		Aggregation_2 obj2=new Aggregation_2(obj1,"btech","engineer",2024);
		obj2.display();

	}

}
