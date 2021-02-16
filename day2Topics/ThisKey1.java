package day2Topics;

public class ThisKey1 
{
	int id;
	String name; 


	public ThisKey1(int id, String name)
	{
		this.id = id; // refer current class instance variable
		this.name = name;
	}
	
	/*public ThisKey1(int id,String name)
	{
		id=id;
		name=name;
	}*/

	@Override
	public String toString() 
	{
		return "ThisKey1 [id=" + id + ", name=" + name + "]";
	}

	
}
