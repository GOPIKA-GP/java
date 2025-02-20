package DEMO;

public class MultilevelInheritance_3 extends MultilevelInheritance_2{
	
String daughter="Gopika G P";
	
	public void daughter()
	
	{
		System.out.println("Daughter : "+daughter);
	}

	public static void main(String[] args) {
		MultilevelInheritance_3 obj= new MultilevelInheritance_3();
		obj.grandfather();
		obj.father();
		obj.daughter();

	}

}
