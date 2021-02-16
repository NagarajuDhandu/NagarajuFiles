package day2Topics;

public class Address 
{
	String city,state,countary;

	public Address(String city, String state, String countary) 
	{
		this.city = city;
		this.state = state;
		this.countary = countary;
	}

	@Override
	public String toString() 
	{
		return "Address [city=" + city + ", state=" + state + ", countary=" + countary + "]";
	}
	
	
}
