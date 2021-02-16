package day2Topics;

public class MainEmp 
{
	public static void main(String[] args) 
	{
		Address add = new Address("Nizamabad", "Telangana", "India");
		Address addd= new Address("Hyderabad", "Karnataka", "India");
		
		Employee employee=new Employee(12, "Siraj", add);
		Employee employee2=new Employee(10, "Rishab", addd);
		
		System.out.println(employee);
		System.out.println(employee2);
	}
}
