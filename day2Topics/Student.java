package day2Topics;

public class Student 
{
	String name;
	int rollNo;
	String cours;
	
	public Student(String name, int rollNo, String cours) 
	{
		this.name = name;
		this.rollNo = rollNo;
		this.cours = cours;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", rollNo=" + rollNo;
	}

	
}
