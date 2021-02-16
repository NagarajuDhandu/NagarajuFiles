package day2Topics;

/**
 * @author tech
 *
 */
public class StaticKey1 
{
	int rolNo;
	String name;
	static String college="vrec"; //College Name Static variable becz For all Students Only
	 							   // one College name will be their.
	
	public StaticKey1(int rolNo, String name) 
	{
		this.rolNo = rolNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StaticKey1 [rolNo=" + rolNo + ", name=" + name + ", college=" + college+"]";
	}
	
	
}
