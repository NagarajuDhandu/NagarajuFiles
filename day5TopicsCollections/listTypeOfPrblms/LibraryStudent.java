package day5TopicsCollections.listTypeOfPrblms;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryStudent 
{
	ArrayList<Student> studentList = new ArrayList<>();
	
	public void addStudent()
	{
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the StudentId..");
		Integer id=sc.nextInt();
		s.setStudentId(id);
		System.out.println("Enter the StudentName..");
		String name=sc.next();
		s.setStudentName(name);
		System.out.println("Enter the Date Of Birth..");
		String dob=sc.next();
		s.setDateOfBirth(dob);
	}
}
