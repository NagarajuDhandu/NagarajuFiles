package day2Topics;

import java.util.ArrayList;
import java.util.List;

public class mainAssociation2 {

	public static void main(String[] args) 
	{
		Student student=new Student("Dn", 1, "cse");
		Student student1=new Student("Rn", 2, "ece");
		Student student2=new Student("king", 3, "eee");
		Student student3=new Student("Queen", 4, "ece");
		Student student4=new Student("rajaa", 5, "cse");
		Student student5=new Student("Qwerty", 6, "eee");
	
		
		List<Student> cse_std=new ArrayList<Student>();
		
		cse_std.add(student);
		cse_std.add(student4);
		
		List<Student> ece_std=new ArrayList<Student>();
		
		ece_std.add(student1);
		ece_std.add(student3);
		
		List<Student> eee_std=new ArrayList<Student>();
		
		eee_std.add(student2);
		eee_std.add(student5);
		
		Course cse = new Course("cse", cse_std);
		Course ece= new Course("ece", ece_std);
		Course eee= new Course("eee", eee_std);
		
		List<Course> courses = new ArrayList<>();
		
		courses.add(cse);
		courses.add(ece);
		courses.add(eee);
		
		College college = new College("VREC", courses);
		
		System.out.println("Total number of Students in the College "+college.collegeName+" is "+college.countStudents());
		
		
		System.out.println(college);
		
		
		
		
	}
}
