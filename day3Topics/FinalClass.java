package day3Topics;

public class FinalClass 
{
	final String name="King";
	
	final void walk()
	{
		System.out.println("Walk for 100 km...");
	}
	
	void changeName()
	{
		//name="Queen";  The final field FinalClass.name cannot be assigned
		System.out.println("Name is final Variable so we Cannot Change The Value Of It");
	}
}
