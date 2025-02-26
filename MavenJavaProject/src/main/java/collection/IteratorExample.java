package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) 
	{
		ArrayList<String>obj1=new ArrayList<String>();
		obj1.add("Apple");
		obj1.add("Orange");
		obj1.add("Grapes");
		obj1.add("Kiwi");
		obj1.add("Banana");
		
		Iterator<String> it=obj1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(obj1);
	}

}
