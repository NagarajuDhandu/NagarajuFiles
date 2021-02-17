package day3Topics;
// private class members will access in same class of same package.
// private class members will not access in same class of diff package.
// private class members will not access in diff class of diff package.
public class PrivateModifier 
{
	private int i =40;
	 
	void message()
	{
		System.out.println("hello PrivateModifier..");
	}
	
	public static void main(String[] args) 
	{
		PrivateModifier modifier = new PrivateModifier();
		System.out.println(modifier.i);
		
		modifier.message();
		
	}
}
