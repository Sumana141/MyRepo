package collectionpkg;

import java.util.ArrayList;
import java.util.List;

public class GenericEg 
{

	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<String>();
		
		//Add - to add elements to the list.
		li.add("Red");
		li.add("Green");
		li.add("Blue");
		li.add("Blue");
		System.out.println(li);
		
		//Set - ton insert or replace element to a particular index.
		li.set(1, "New Pink");
		System.out.println(li);
		
		//IndexOf - to identify the index of element in an array.
		System.out.println(li.indexOf("Blue"));
		
		//LastIndexOf - to get index of last occurrence if there are repeated occurrence.
		System.out.println(li.lastIndexOf("Blue"));
		
		//Get - To get value at particular index.
		System.out.println(li.get(0));
		
		//Contains - To check whether a particular value is present in the list.
		System.out.println(li.contains("Red"));
		System.out.println(li.contains("Green"));
		
		//Remove - To delete value from a particular index.
		System.out.println(li.remove(1));
		System.out.println(li);
		
		//IsEmpty - To check whether list is empty or not.
		if(li.isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			System.out.println("Not empty");
		}
		
		//Size - To get size/length of list.
		System.out.println(li.size());
		
		//Get - To get the value in the list
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		//Now let us do the same using for each loop
		for(String i:li)
		{
			System.out.println(i);
		}
	}

}
