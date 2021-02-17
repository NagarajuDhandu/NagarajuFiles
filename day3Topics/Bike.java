package day3Topics;

public abstract class Bike 
{
	Bike()
	{
		System.out.println("bike is Created");
	}
	
	abstract void run();
	
	void changeGare()
	{
		System.out.println("Gare changed..");
	}
}
