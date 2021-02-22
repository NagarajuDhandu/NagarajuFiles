package Day6Topics;

public class EnumExample 
{
	//defining the enum inside the class
	public enum Season{WINTER,SPRING,SUMMER,FALL}
	//main method 
	public static void main(String[] args) 
	{
		for (Season s : Season.values()) {
			System.out.println(s);
		}

	}

}
