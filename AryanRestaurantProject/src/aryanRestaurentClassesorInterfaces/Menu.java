package aryanRestaurentClassesorInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu 
{
	Map<Integer, String> veg = new HashMap<>();
	Map<Integer, String> nonVeg = new HashMap<>();
	

	public void display()
	{
		System.out.println("Please Select Veg/NonVeg");

		System.out.println("1.VegItems");
		System.out.println("2.NonVegItems");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			vegItems();
			break;
		case 2:
			nonVegItems();
			break;
		default:
			System.out.println("enter the number between 1 to 2 only");
			display();
			break;
		}
	}
	
	public void vegItems()
	{
		for (Map.Entry it : veg.entrySet()) 
		{
			System.out.println(it.getKey()+" "+it.getValue());
		}
		
		//System.out.println();
		
		System.out.println("Choose Your Item: ");
		
		Scanner sc = new Scanner(System.in);
		
		int choice=sc.nextInt();
		
		if(veg.containsKey(choice))
		{
			System.out.println(veg.get(choice)+" Item Added to Cart SucessFully");
		}
		else
		{
			System.out.println("Enter the Correct number: ");
			vegItems();
		}
	}
	
	public void nonVegItems()
	{
		for (Map.Entry it : nonVeg.entrySet()) 
		{
			System.out.println(it.getKey()+" "+it.getValue());
		}
		
		System.out.println();
		
		System.out.println("Choose Your Item: ");
		
		Scanner sc = new Scanner(System.in);
		
		int choice=sc.nextInt();
		
		if(veg.containsKey(choice))
		{
			System.out.println(veg.get(choice)+" Item Added to Cart SucessFully");
		}
		else
		{
			System.out.println("Enter the Correct number: ");
			nonVegItems();
		}
	}
}


