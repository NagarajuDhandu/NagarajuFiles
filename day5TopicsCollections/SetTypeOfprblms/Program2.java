package day5TopicsCollections.SetTypeOfprblms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program2 
{
	public static void main(String[] args) 
	{
		Set<Integer> inSet= new HashSet<>();
		System.out.println("Printing the HashSet Before adding the Elements...");
		System.out.println(inSet);
		
		inSet.add(20);
		inSet.add(30);
		inSet.add(40);
		inSet.add(80);
		inSet.add(55);
		inSet.add(null);
		inSet.add(null);
		
		System.out.println();
		
		System.out.println("Printing the values After Adding the Elements by lambda Expresion ");
		inSet.forEach(ss->{System.out.println(ss);});
		
		System.out.println();
		
		System.out.println(inSet.isEmpty());
		
		System.out.println();
		
		System.out.println(inSet.contains(80));
		
		System.out.println();
		
		inSet.remove(30);
		
		Iterator<Integer> il=inSet.iterator();
		
		while(il.hasNext())
		{
			System.out.println(il.next());
		}
		
		System.out.println();
		
		Integer iS=inSet.size();
		System.out.println(iS);
	}
}
