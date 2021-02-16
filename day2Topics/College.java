package day2Topics;

import java.util.List;

public class College 
{
	String 	collegeName;
	private List<Course> courses;
	
	public College(String collegeName, List<Course> courses) 
	{
		this.collegeName = collegeName;
		this.courses = courses;
	}
	
	public int countStudents()
	{
		int studentCount=0;
		List<Student> students;
		for (Course course : courses) 
		{
			students=course.studentsData();
			for (Student student : students) 
			{
				studentCount++;
			}
		}
		
		return studentCount;
	}

	@Override
	public String toString() {
		return "[collegeName=" + collegeName + ", courses=" + courses + "]";
	}
	
	
}
