package Abstarction;

public class ImageClass2 extends GoogleParent{
	public void search() {
		System.out.println("I am abstract in Image class");
	}

	public static void main(String[] args) {
		ImageClass2 obj1= new ImageClass2();
		VideoClass1 obj2= new VideoClass1();
		obj2.Googlename();
		obj2.search();
		obj1.search();
		
		
	}

}
