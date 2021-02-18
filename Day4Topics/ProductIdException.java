package Day4Topics;

public class ProductIdException extends Exception
{
	public ProductIdException() 
	{
		System.out.println("Access Denied!..Please Enter 3 Digits in Number Format");
	}
	
	public ProductIdException(String s)
	{
		System.out.println(s);
	}
	
	public ProductIdException(int i ,String s)
	{
		System.out.println(s);
	}
}
