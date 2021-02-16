package day2Topics;

import java.util.List;

public class Course 
{
	String name;
	
	private List<Student> students;

	public Course(String name, List<Student> students) 
	{
		this.name = name;
		this.students = students;
	}
	
	public List<Student> studentsData()
	{
		return students;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", students=" + students + "]";
	}

	
}
