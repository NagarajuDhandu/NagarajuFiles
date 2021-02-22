package StringPrograms;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the 1st String..");
		
		String s1=sc.next();
		
		System.out.println(s1);
		System.out.println();
		
		System.out.println("Enter the 2nd String");
		String s2=sc.next();
		System.out.println(s2);
		
		s1.concat(s2);
		
		System.out.println();
		
		System.out.println(s1);
		
		 s1=s1.concat(s2);
		 
		 System.out.println(s1);
	}

}
