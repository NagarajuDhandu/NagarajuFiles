package day2Topics;

import java.util.List;

public class Person 
{
	private String name;
	
	List<Mobile> numbers;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public List<Mobile> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Mobile> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() 
	{
		return "Person [name=" + name + ", numbers=" + numbers + "]";
	}
	
	
}
