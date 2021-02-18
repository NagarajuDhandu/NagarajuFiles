package Day4Topics;

import java.util.Scanner;

public class NestedTryCatch 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		try
		{  
			try
			{  
				System.out.println("going to divide");
				System.out.println("Enter the Values of a and b");
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c =a/b;  
				System.out.println(b);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Can't divided by zero");
			}  

			try
			{  
				int a[]=new int[6];
				System.out.println("Enter the Value to insert in the Array");
				a[6]=scanner.nextInt();  
				System.out.println(a[5]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println();
			}  

			System.out.println("other statement");  
		}
		catch(Exception e)
		{
			System.out.println("handeled");
		}  

		System.out.println("normal flow..");  
	}  
}
