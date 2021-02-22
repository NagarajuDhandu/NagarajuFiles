package day5TopicsCollections.listTypeOfPrblms;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program1_1 {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();

		list.add("ravi");
		list.add("ram");
		list.add("qwerty");
		list.add("Gowtham");
		list.add("Ravinder");
		
		ListIterator<String> li=list.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		list.remove(1);
		
		list.set(1, "ram");//it will set the value based on index value without removing past element.
		System.out.println(list);
	
		ListIterator<String> l = list.listIterator(1);//it takes argument as index and start the execution from that position.
		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
		list.remove(1);//it will remove the object besed on the index we pass
		
		System.out.println(list);
		
		System.out.println(list.subList(1, 3));//it will print the elements based of argumnets we are passing 1st agument start position 2nd argument for end positon.
		
	}

}
