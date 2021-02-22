package day5TopicsCollections.listTypeOfPrblms;

import java.util.ListIterator;
import java.util.Vector;

public class Program3_1 {

	public static void main(String[] args) 
	{
		Vector<String> vector = new Vector<>();
		
		vector.add("Surender");
		vector.add("Ravinder");
		vector.add("Gowtham");
		vector.add("Sai Teja");
		vector.add("Surender");
		
		ListIterator<String> li = vector.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
