package Abstarction;

public class AbstractInterface2 implements AbstractionInterface{
	
	public void display() {
		System.out.println("Fist Integer :"+ a);
	}
	public void print() {
		System.out.println("Second Integer "+b);
	}
	

public static void main(String[] args) {
	AbstractionInterface obj= new AbstractInterface2(); //Parent class obj= new child class or wise versa if any this need to print from child class
	obj.display();
	obj.print();
}
	
}