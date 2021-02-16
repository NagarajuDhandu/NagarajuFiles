package day2Topics;

public class MainStatic {

	public static void main(String[] args) 
	{
	/*	StaticKey1 st = new StaticKey1(11,"Qwrety");
		StaticKey1 stt = new StaticKey1(100, "Dhanu");
		
		System.out.println(st);
		
		System.out.println(stt); */
		
		StaticKey2.change();
	
		StaticKey2 key2=new StaticKey2(21,"ranii");
		key2.dispaly();
	
		StaticKey2 key=new StaticKey2(212,"iconic");
		key.dispaly();
	}

}
