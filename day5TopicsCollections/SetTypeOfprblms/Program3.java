package day5TopicsCollections.SetTypeOfprblms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program3 {

	public static void main(String[] args) 
	{
		Set<Character> set = new LinkedHashSet<>();
		
		set.add('A');
		set.add('B');
		set.add('C');
		set.add('A');
		set.add('D');
		set.add('E');
		
		System.out.println(set);
		
		Iterator<Character> ch=set.iterator();
		
		while(ch.hasNext())
		{
			System.out.println(ch.next());
		}
		
		set.remove('C');
		
		System.out.println(set);
		
		set.clear();
		
		System.out.println(set);
	}

}
