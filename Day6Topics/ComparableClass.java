package Day6Topics;

public class ComparableClass implements Comparable<ComparableClass>
{
	int rollno;  
	String name;  
	int age;  
	public ComparableClass(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  

	@Override
	public int compareTo(ComparableClass o) 
	{
		if (age==o.age) 
		{
			return 0;
		}
		else if (age>o.age) 
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
