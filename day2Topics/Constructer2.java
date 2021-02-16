package day2Topics;

public class Constructer2 
{
	int length;
	int width;
	int hight;
	
	public Constructer2(int length, int hight) 
	{
		this.length = length;
		this.hight = hight;
	}

	public Constructer2(int length, int width, int hight) 
	{
		this(length,hight);
		this.width = width;
	}
	
	void dispaly()
	{
		System.out.println("Length :"+length+" Width :"+width+" Hight :"+hight);
	}
	
	
}
