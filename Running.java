package org.Techouts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Running {

	public static void main(String[] args) 
	{
		ArrayList<Laptop> lap=new ArrayList<Laptop>();
		
		lap.add(new Laptop("Dell", 6, 1000.0));
		lap.add(new Laptop("Hp", 12, 6000.0));
		lap.add(new Laptop("Acers", 8, 12000.0));
		
		Comparator<Laptop> lpt = new Comparator<Laptop>()
		{
			@Override
			public int compare(Laptop o1, Laptop o2) {
				if (o1.price>o2.price) 
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
		};
		
		Collections.sort(lap, lpt);
		
		lap.forEach(a->{System.out.println(a);});
	}

}
