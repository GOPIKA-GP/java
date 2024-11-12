package ArrayListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		List <String> l1=new ArrayList();
		l1.add("Grapes");
		l1.add("Apple");
		l1.add("Banana");
		
		System.out.println(l1);
		
		//non generic 
		ArrayList l2=new ArrayList();
		l2.add(1);
		l2.add(4);
		l2.add('G');
		l2.add("Gopika");
		
		System.out.println(l2);
		
		//Generic Collection
		
		ArrayList <String> l3=new ArrayList<String>();
		l3.add("Sun");
		l3.add("Moon");
		l3.add("Moon");
		l3.add(null);
		l3.add(null);
		l3.add("Stars");
		l3.add("Apple");
		System.out.println(l3);
		
		System.out.println(l3.isEmpty());
		
		System.out.println(l3.size());
		
		System.out.println(l3.contains("Sun"));
		
		l3.remove(0);
		System.out.println(l3);
		
		l3.remove("Moon");
		System.out.println(l3);
		
		Collections.sort(l1);//utility class
		System.out.println(l1);
		
		l1.addAll(l3);
		System.out.println(l1);
		
		l1.removeAll(l3);
		System.out.println(l1);
		
		System.out.println(l1.get(1));
		

		
		
	}

}
