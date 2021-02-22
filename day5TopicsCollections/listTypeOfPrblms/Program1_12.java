package day5TopicsCollections.listTypeOfPrblms;

import java.util.ArrayList;

public class Program1_12 
{
	public static void main(String[] args) {
		
	
	ArrayList<String> list = new ArrayList<>();
	
	list.add("A");
	list.add("Ab");
	list.add("Abc");
	list.add("Abcd");
	list.add(3, "Abcc");
	
	System.out.println(list);
	
	ArrayList<String> list2= new ArrayList<String>();
	
	list2.add("B");
	list2.add("Bc");
	list.addAll(list2);
	
	System.out.println(list);
	
	}
}
