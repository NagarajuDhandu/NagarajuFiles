package day2Topics;

public class Circle 
{
	static double pi = 3.14;
	
	Operation op;
	
	double area(int radius)
	{
		Operation oo=op.getObj();
		
		int rSquare=oo.square(radius);
		
		return pi*rSquare;
	}
}
