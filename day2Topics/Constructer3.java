package day2Topics;

public class Constructer3 
{
	int id;
	String name;
	double marks;
	public Constructer3(int id, String name, double marks) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	Constructer3(Constructer3 c)
	{
		this.id=c.id;
		this.name=c.name;
		this.marks=c.marks;
	}

	@Override
	public String toString() 
	{
		return "Constructer3 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
