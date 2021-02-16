package day2Topics;

public class Constructer1
{

	public Constructer1() 
	{
		super();
	}
	
	public Constructer1(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public Constructer1(double c,double d)
	{
		double e=d-c;
		System.out.println(e);
	}
	
	public Constructer1(int c,double d)
	{
		double a=d*c;
		System.out.println(a);
	}
	
	public Constructer1(double c,int d)
	{
		double e=d/c;
		System.out.println(e);
	}
	
}
