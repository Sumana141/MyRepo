package collectionpkg;

import java.util.HashSet;
import java.util.Set;

public class SetEg 
{

	public static void main(String[] args) 
	{
		Set s = new HashSet();
		
		//add method
		s.add("Red");
		s.add("Green");
		s.add("Blue");
		System.out.println(s);
		
		//addAll method - add sets
		Set q = new HashSet();
		q.add("Jasmine");
		q.add("Rose");
		q.add("Thulsi");
		System.out.println(s.addAll(q));
		System.out.println(s);
		
		//contains - to check whether an element is present.
		System.out.println(s.contains("Thulsi"));
		//containsAll - to check whether a set contain another set.
		System.out.println(s.containsAll(q));
		
		//size - to get length of set.
		System.out.println(s.size());
		
		//isEmpty - check whether set is empty.
		System.out.println(s.isEmpty());
		
		//remove - to remove/delete an element.
		System.out.println(s.remove("Red"));
		System.out.println(s);
		
		//clear - to clear set.
		q.clear();
		System.out.println(q);
		System.out.println(s);
	}

}
