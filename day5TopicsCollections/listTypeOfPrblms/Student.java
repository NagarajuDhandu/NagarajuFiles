package day5TopicsCollections.listTypeOfPrblms;

import java.util.Scanner;

public class Student
{
	Integer studentId;
	String studentName;
	String dateOfBirth;
	
	public Student(Integer studentId,String studentName,String dateOfBirth)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.dateOfBirth=dateOfBirth;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	
	
}
