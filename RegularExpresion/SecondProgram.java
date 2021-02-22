package RegularExpresion;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecondProgram {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		boolean a=Pattern.matches("[abc]", sc.next());
		System.out.println(a);
		
		System.out.println();
		
		boolean b=Pattern.matches("[^dnr]+", sc.next());
		System.out.println(b);
		System.out.println();
		
		System.out.println(Pattern.matches("[a-zA-Z]", sc.next() ));
		System.out.println();
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
	}

}
