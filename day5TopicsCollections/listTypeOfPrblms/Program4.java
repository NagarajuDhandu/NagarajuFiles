package day5TopicsCollections.listTypeOfPrblms;

import java.util.Stack;

public class Program4 {

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<>();
		
		stack.add("Surender");
		stack.add("Ravinder");
		stack.add("Gowtham");
		stack.add("Sai Teja");
		stack.add("Surender");
		
		System.out.println(stack);
		
		System.out.println();
		
		for (String s : stack) 
		{
			System.out.println(s);
		}
	}

}
