package collection;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) 
	{
		ArrayList<String>obj1=new ArrayList<String>();
		obj1.add("Apple");
		obj1.add("Orange");
		obj1.add("Grapes");
		obj1.add("Kiwi");
		obj1.add("Banana");
		
		for(String x:obj1)
		{
			System.out.println(x);
		}
	}
}