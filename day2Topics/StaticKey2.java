package day2Topics;

public class StaticKey2 
{
	int rolNo;
	String name;
	static String college="vrec"; //College Name Static variable becz For all Students Only
	 							   // one College name will be their.
	
	public StaticKey2(int rolNo, String name) 
	{
		this.rolNo = rolNo;
		this.name = name;
	}
	
	static void change()
	{
		college="kect";
	}
	
	 void dispaly()
	{
		System.out.println("StaticKey1 [rolNo=" + rolNo + ", name=" + name + ", college=" + college+"]");
	}
	
	
}
