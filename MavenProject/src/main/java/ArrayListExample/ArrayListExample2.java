package ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		ArrayList <String> l3=new ArrayList<String>();
		l3.add("Sun");
		l3.add("Moon");
		l3.add("Grapes");
		l3.add("Stars");
		l3.add("Apple");
		
		System.out.println("For loop");
		for(int i=0;i<l3.size();i++)
		{
			System.out.println(l3.get(i));

	    }
		
		
		System.out.println("For each loop");
		for(String i:l3) 
		{
			System.out.println(i);
		}
		
		
		System.out.println("ITERATOR");
		Iterator<String> it=l3.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());	
				}
				
				
				System.out.println("ITERATOR-REMOVE");
				it.remove();
				System.out.println(l3);//removes the last element
}}
