package inheritance;

public class Daughter extends Father{
	String ns="Sona";
	public void daughterss()
	{
		System.out.println("Daughter : " + ns);
	}

	public static void main(String[] args) {
		Daughter obj1=new Daughter();
				obj1.grandfatherss();
		obj1.fatherss();
		obj1.daughterss();
		Son obj=new Son();
		obj.sons();
		
		

	}

}
