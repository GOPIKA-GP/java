package ArrayListExample;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		
		ArrayList <String> colours=new ArrayList<String>();
		colours.add("Violet");
		colours.add("Blue");
		colours.add("Green");
		colours.add("Yellow");
		colours.add("Orange");
		colours.add("Red");
		System.out.println(colours);
	
        ArrayList <Integer> num=new ArrayList<Integer>();
	    num.add(10);
	    num.add(20);
	    num.add(30);
	    num.add(40);
	    num.add(50);
	    System.out.println(num);
	    
	    
	    ArrayList <Character> c=new ArrayList<Character>();
	    c.add('A');
	    c.add('E');
	    c.add('I');
	    c.add('O');
	    c.add('U');
	    System.out.println(c); 
	    
	    
	    ArrayList <Double> d=new ArrayList<Double>();
	    d.add(11.11);
	    d.add(22.22);
	    d.add(33.33);
	    d.add(44.44);
	    System.out.println(d);
	    
	    d.set(0, 66.66);//replacing the index element
	    System.out.println(d);
    }

		

}
