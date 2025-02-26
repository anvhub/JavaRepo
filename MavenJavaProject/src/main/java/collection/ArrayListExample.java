package collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<String>obj1=new ArrayList<String>();
		obj1.add("Apple");
		obj1.add("Orange");
		obj1.add("Grapes");
		obj1.add("Kiwi");
		obj1.add("Banana");
		
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("Banana");	
		
		obj.addAll(obj1);
		System.out.println(obj);
		System.out.println(obj.contains("Kiwi"));
		System.out.println(obj.get(2));
		System.out.println(obj.isEmpty());
		
	}

}