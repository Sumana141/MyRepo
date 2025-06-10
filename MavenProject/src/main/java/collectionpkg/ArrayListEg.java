package collectionpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList li = new ArrayList();
		
		//Add - to add elements to the list.
				li.add("Red");
				li.add("Green");
				li.add("Blue");
				li.add("Blue");
				System.out.println(li);
				
		ArrayList a = new ArrayList();
		a.add("Rose");
		a.add("Jasmine");
		a.add("Thulsi");
		System.out.println(a);
		
		//AddAll - To combine or add lists.
		System.out.println(li.addAll(a));
		System.out.println(li);
		
		
		
		//Iterator
		Iterator itr = li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		itr.remove();
		System.out.println(li);
	}

}
