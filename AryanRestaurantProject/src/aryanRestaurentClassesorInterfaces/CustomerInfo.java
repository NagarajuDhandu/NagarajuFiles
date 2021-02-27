package aryanRestaurentClassesorInterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustomerInfo 
{
	public void check(String name)
	{
		CustomerDetails cd= new CustomerDetails("Nagaraju", "8106907063","Draju12@", "Draju12@");
		CustomerDetails cd1= new CustomerDetails("Aryan", "9494060905","Arnrn12@", "Arnrn12@");
		CustomerDetails cd2= new CustomerDetails("Naganna", "9492109991","Nanna12@", "Nanna12@");
		CustomerDetails cd3= new CustomerDetails("Madhu", "8106907062","Mraju12@", "Mraju12@");
		
		ArrayList<CustomerDetails> list = new ArrayList<>();
		
		list.add(cd);
		list.add(cd1);
		list.add(cd2);
		list.add(cd3);
		
		cd.setName(list);
	}
}
