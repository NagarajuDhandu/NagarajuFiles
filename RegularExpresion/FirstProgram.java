package RegularExpresion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstProgram {

	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("..s");
		
		Matcher m=p.matcher("aas");
		
		boolean b =m.matches();
		
		System.out.println(b);
		
		boolean pp=Pattern.compile(".s").matcher("cs").matches();
		
		System.out.println(pp);
		
		boolean bb=Pattern.matches("...s", "dnrs");
		
		System.out.println(bb);
		System.out.println();
		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s) 
	}

}
