package day5TopicsCollections.listTypeOfPrblms;

import java.util.ListIterator;
import java.util.Stack;

public class Program4_1 {

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<>();
		
		stack.add("Surender");
		stack.add("Ravinder");
		stack.add("Gowtham");
		stack.add("Sai Teja");
		stack.add("Surender");
		
		ListIterator<String> li =stack.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
