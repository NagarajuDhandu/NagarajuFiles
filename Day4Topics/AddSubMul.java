package Day4Topics;

import java.util.Scanner;

public class AddSubMul
{
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the values.");
	int a = scanner.nextInt();
	
	int b = scanner.nextInt();
	
	try 
	{
		if (a>0 & b>0) 
		{
			int add=a+b;
			System.out.print(add+" ");
			int mul=a*b;
			System.out.print(mul+" ");
			int sub=a-b;
			System.out.print(sub);
		}
		else
		{
			throw new ArithmeticException("Access Denied..please enter the values >0");
		}
		
	} 
	catch (Exception e) 
	{
		System.out.println(e);
	}
	
	}
}
