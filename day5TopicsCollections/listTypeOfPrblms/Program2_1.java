package day5TopicsCollections.listTypeOfPrblms;

import java.util.Iterator;
import java.util.LinkedList;

public class Program2_1 {

	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<>();

		list.add("Surender");
		list.add("Ravinder");
		list.add("Gowtham");
		list.add("Sai Teja");
		list.add("Surender");
		
		Iterator<String> ire=list.iterator();
		
		while(ire.hasNext())
		{
			System.out.println(ire.next());
		}

	}

}
