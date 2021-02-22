package day5TopicsCollections.listTypeOfPrblms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Program1 extends Program1_1
{
	public static void main(String[] args) 
	{
		LinkedList<String> s = new LinkedList<>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		//boolean add(E e)	It is used to append the specified element at the end of a list
		list1.add("ravi");
		list1.add("ram");
		list1.add("qwerty");
		list1.add("Gowtham");
		list1.add("Ravinder");
		
		// void add(int index, E element)It is used to insert the specified element at the specified position in a list
		list1.add(4, "keka");

		System.out.println(list1);
		
		list1.addAll(3,s);
		
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		System.out.println();
		}
}
