package day3Topics;

public class TestBank {

	public static void main(String[] args) 
	{
		Bank bank = new SBI();
		Double d1=bank.getRateOfIntrest();
		
		Bank bank2 = new ICICI();
		Double d2=bank2.getRateOfIntrest();
		
		Bank bank3 = new AXIS();
		Double d3=bank3.getRateOfIntrest();
		
		System.out.println("SBI Rate of Intrest is :"+d1);
		System.out.println("ICICI Rate of Intrest is :"+d2);
		System.out.println("AXIS Rate of Intrest is :"+d3);
	}

}
