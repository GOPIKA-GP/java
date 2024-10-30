package inheritance;

public class Puppy extends Dog {

	int age=1;
	
	public void dis() {
		System.out.println("The age of puppy is :"+age);
	}
public static void main(String[] args) {
	
Puppy obj=new Puppy();
obj.display();
obj.family();
obj.dis();
}
}
