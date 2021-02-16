package day2Topics;

public class Operation 
{
	int square(int n)
	{
		int m=n*n;
		return m;
	}
	
	public static Operation getObj()
	{
		return new Operation();
		
	}
	
}
