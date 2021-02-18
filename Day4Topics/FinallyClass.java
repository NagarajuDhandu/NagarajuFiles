package Day4Topics;

import java.util.Scanner;

public class FinallyClass 
{
	public String method(String name)
	{
		return name;
	}

	public static void main(String[] args)
	{
		//Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name....");
		String s1=null;

		FinallyClass class1 = new FinallyClass();
		String name=class1.method(s1);
		try
		{
			if (name!=null) 
			{
				System.out.println(name);
			}
			else
			{
				throw new NullPointerException();
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid name");
		}
		
		finally 
		{
			System.out.println("Finally block Gets Executed Irrespective of Excepton");
			System.out.println("Termination statements are defined in finally Block");
			System.out.println("connction.close();,exit()....ect.....");
		}
		
	}
}
