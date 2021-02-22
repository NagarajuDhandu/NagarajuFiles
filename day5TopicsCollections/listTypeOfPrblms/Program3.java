package day5TopicsCollections.listTypeOfPrblms;

import java.util.Vector;

public class Program3 {

	public static void main(String[] args) 
	{
		Vector<String> vector = new Vector<>();
		
		vector.add("Surender");
		vector.add("Ravinder");
		vector.add("Gowtham");
		vector.add("Sai Teja");
		vector.add("Surender");
		
		System.out.println();
		
		System.out.println(vector);
		
		for (String s : vector) 
		{
			System.out.println(s);
		}
		
		/*for (int i = 0; i < vector.size(); i++) 
		{
			String ss=vector.get(i);
			System.out.println(ss);
		}*/
	}

}
