package ArrayListExample;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
	
		Set<String> s1=new HashSet<String>();
		s1.add("Red");
		s1.add("Yellow");
		s1.add("Blue");
		s1.add("White");
		System.out.println(s1);
		
		HashSet h1=new HashSet();
		h1.add(2);
		h1.add('c');
		h1.add("Black");
		h1.add(6);
		System.out.println(h1);
		
		HashSet<String> h2=new HashSet<String>();
		h2.add("sun");
		h2.add("moon");
		h2.add("sun");
		h2.add("stars");
		System.out.println(h2);
		
   h2.addAll(h1);
   System.out.println(h2);
   
   h2.removeAll(h1);
   System.out.println(h2);
   
   h2.remove("sun");
   System.out.println(h2);
   
   System.out.println("ITERATOR");
	Iterator<String> it=h2.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());	
			}
   
   
  
	}

}
