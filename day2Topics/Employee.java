package day2Topics;

public class Employee 
{
	int id;
	
	String name;
	
	Address address;// Has-A RelationShip Address class Reference Variable..

	public Employee(int id, String name, Address address) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
}
