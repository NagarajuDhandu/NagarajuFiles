package day5TopicsCollections.SetTypeOfprblms;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Program1 
{
	public static void main(String[] args) 
	{
		Set<String> set = new TreeSet<>();

		set.add("Dn");
		set.add("Pavan");
		set.add("Srikanth");
		set.add("Gowtham");
		set.add("Ravindher");

		System.out.println(set);
		System.out.println();

		Iterator<String> is=set.iterator();

		while(is.hasNext())
		{
			System.out.println(is.next());
		}

		System.out.println();

		set.remove("Dn");

		Set<String> set1= new HashSet<String>(); 

		set1.add("Pavan");
		set1.add("Srikanth");
		
		set.removeAll(set1);
		
		System.out.println("Printing The Values by Using LambdaExpression..");
		set.forEach(s->
		{
			System.out.println(s);
		}
				);
		
		set.clear();
		
		System.out.println(set);
	}
}
