package Day6Topics;

public class EnumExample1 
{
	public enum Season{WINTER,SPRING,SUMMER,FALL}
	
	public static void main(String[] args) 
	{
		for (Season s : Season.values()) 
		{
			System.out.println(s);
		}
		
		System.out.println("Value of the Winter is: "+Season.valueOf("WINTER"));
		System.out.println("Index of Winter is: "+Season.valueOf("WINTER").ordinal());
		System.out.println("Index of Summer id: "+Season.valueOf("SUMMER").ordinal());
	}
}
