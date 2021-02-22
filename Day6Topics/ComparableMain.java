package Day6Topics;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {

	public static void main(String[] args) 
	{
		ArrayList<ComparableClass> list = new ArrayList<ComparableClass>();
		
		list.add(new ComparableClass(101, "raja", 21));
		list.add(new ComparableClass(102, "kaja", 20));
		list.add(new ComparableClass(103, "baja", 25));
		
		Collections.sort(list);
		
		for(ComparableClass cc:list)
		{
			System.out.println(cc.rollno+" "+cc.name+" "+cc.age);
		}
		
		
	}

}
