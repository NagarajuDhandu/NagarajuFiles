package day3Topics;

public class DogStatic 
{
	public static void run()
	{
		System.out.println("Rannnnnn.....");
	}
	
	private void kick()
	{
		System.out.println("Kick the ball....");
	}
	
	public static void main(String[] args) 
	{
		DogStatic dogStatic=new DogStatic();
		dogStatic.kick();
	}
}
