package StringPrograms;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the 1st String..");
		String s1=sc.next();
		
		System.out.println();
		
		System.out.println("Enter the 2nd String...");
		String s2=sc.next();
		
		System.out.println();
		
		//System.out.println("Enter the 3nd String...");
		String s3=new String("sachin");
		
		System.out.println();
		
		System.out.println("Enter the 4th String..");
		String s4=sc.next();
		
		System.out.println();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		
		
	}

}
