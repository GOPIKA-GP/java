package Polymorphism;

public class Hockey extends Cricket
{
	public void play()
	{
		super.play();
		System.out.println("sports-Hockey");
		
}
	
	public static void main(String[] args)
	{
		Sports s;
		s=new Football();
		s.play();
		s=new Cricket();
		s.play();
		s=new Hockey();
		s.play();
		
	}
}
