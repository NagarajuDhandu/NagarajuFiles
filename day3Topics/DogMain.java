package day3Topics;

public class DogMain extends DogStatic 
{
	public static void run()
	{
		System.out.println("ram");
	}
	
	
	
	public static void main(String[] args) 
	{
		//DogStatic static1 = new DogStatic();
		
		//DogStatic.run();
		
		DogMain dogMain = new DogMain();
		dogMain.run();
	}

}
