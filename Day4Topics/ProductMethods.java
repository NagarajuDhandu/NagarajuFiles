package Day4Topics;

import java.util.Scanner;

public class ProductMethods 
{
	static ProductClass class1= new ProductClass();
	static Scanner scanner = new Scanner(System.in);
	public static void m1()
	{
		System.out.println("Enter The ProductId...");
		class1.setProductid(scanner.next());
		String s=class1.getProductId();
		try{
			if (s!=null) 
			{
				System.out.println(s);
				m2();
			}
			else
			{
				throw new ProductIdException();
			}

		}
		catch (ProductIdException e)
		{
			m1();
		}
	}

	public static void m2()
	{
		System.out.println("Enter the productName..");
		class1.setProductName(scanner.next());
		String s1=class1.getProductName();

		if (s1!=null) 
		{
			System.out.println(s1);
			m3();
		}
		else
		{
			String ss=" Name of the Characters length should be 0 to 15 only..... ";
			try{
				throw new ProductIdException(ss);
			}
			catch(ProductIdException e)
			{
				m2();
			}
		}
	}
	
	public static void m3()
	{
		System.out.println("Enter the Productprice...");
		class1.setProductPrice(scanner.next());

		String s2=class1.getProductPrice();

		if (s2!=null) 
		{
			System.out.println(s2);
		}
		else
		{
			String s4="'-'Minus Values are not allowed Please Enter the Price Greater than '0' ";
			try
			{
				throw new ProductIdException(0, s4);
			}
			catch (Exception e) 
			{
				m3();
			}
		}
	}
}