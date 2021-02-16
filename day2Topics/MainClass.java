package day2Topics;

public class MainClass {

	public static void main(String[] args) 
	{
		//Constructer1 con = new Constructer1(10,2.2);
		//System.out.println(con);
		
	/*	Constructer2 cons=new Constructer2(10,20);
		Constructer2 co=new Constructer2(10,20,30);
		
		cons.dispaly();
		co.dispaly();*/
		
		Constructer3 cc=new Constructer3(101,"King",1000.0);
		//System.out.println(cc);
		Constructer3 cc1=new Constructer3(cc);
		System.out.println(cc1);
		
	}

}
