package day2Topics;

import java.util.ArrayList;
import java.util.List;

public class mainAssociation {

	public static void main(String[] args) 
	{
		Person person =new  Person();
		person.setName("ManiKantaSir");
		
		Mobile number1=new Mobile();
		number1.setMobileNo("9966662310");
		
		Mobile number2=new Mobile();
		number2.setMobileNo("9492123456");
		
		List<Mobile> list=new ArrayList<>();
		list.add(number1);
		list.add(number2);
		
		person.setNumbers(list);
		
		System.out.println(person.getNumbers()+" are mobile numbers of the Person "+"'"+person.getName()+"'");
		
	}

}
