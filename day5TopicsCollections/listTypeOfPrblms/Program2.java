package day5TopicsCollections.listTypeOfPrblms;

import java.util.Iterator;
import java.util.LinkedList;

public class Program2 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Surender");
		list.add("Ravinder");
		list.add("Gowtham");
		list.add("SaiTeja");
		list.add("Suren");
		
		System.out.println(list);
		System.out.println();
		
		for (String string : list)
		{
			System.out.println(string);
		}
		System.out.println();
		System.out.println("Traversing list through forEach() method:"); 
		 //The forEach() method is a new feature, introduced in Java 8.  
		list.forEach(a->{System.out.println(a);});//Here, we are using lambda expression 
		
		System.out.println();
		  System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> li=list.iterator();
		
		li.forEachRemaining(a->{System.out.println(a);});//Here, we are using lambda expression  
		
		
	}
}
